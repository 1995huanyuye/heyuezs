package com.heyue.serivce.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import com.heyue.bo.HeyueUserDetails;
import com.heyue.dao.UserRoleRelationDao;
import com.heyue.dto.LoginDto;
import com.heyue.dto.UpdateUserPasswordParam;
import com.heyue.dto.UserParam;
import com.heyue.exception.Asserts;
import com.heyue.mapper.RoleMapper;
import com.heyue.mapper.UserLoginLogMapper;
import com.heyue.mapper.UserMapper;
import com.heyue.mapper.UserRoleRelationMapper;
import com.heyue.model.*;
import com.heyue.security.util.JwtTokenUtil;
import com.heyue.security.util.SpringUtil;
import com.heyue.serivce.UserAdminService;
import com.heyue.serivce.UserCacheService;
import com.heyue.util.PKeyGenerator;
import com.heyue.util.RequestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserAdminServiceImpl implements UserAdminService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserAdminServiceImpl.class);
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserRoleRelationMapper userRoleRelationMapper;
    @Autowired
    private UserRoleRelationDao userRoleRelationDao;
    @Autowired
    private UserLoginLogMapper loginLogMapper;



    @Override
    public User getUserByUserCode(String usercode) {
        User user = getCacheService().getUser(usercode);
        if(user!=null) {
            return user;
        }
        UserExample example = new UserExample();
        example.createCriteria().andUsercodeEqualTo(usercode);
        List<User> usersList = userMapper.selectByExample(example);
        if (usersList != null && usersList.size() > 0) {
            user = usersList.get(0);
            getCacheService().setUser(user);
            return user;
        }
        return null;
    }

    @Override
    public User register(UserParam userParam) {
        User user = new User();
        BeanUtils.copyProperties(userParam,user);
        user.setStatus(1);
        //查询是否有相同用户名的用户
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsercodeEqualTo(user.getUserCode());
        List<User> userList = userMapper.selectByExample(userExample);
        if(userList.size()>0){
            return null;
        }
        //加密密码
        String encode = passwordEncoder.encode(user.getPassword());
        user.setId(PKeyGenerator.generator());
        user.setPassword(encode);
        userMapper.insert(user);
        return user;
    }

    @Override
    public LoginDto login(String usercode, String password) {
        LoginDto loginDto = new LoginDto();
        String token = null;
        //密码需要客户端加密后传递
        try {
            UserDetails userDetails = loadUserByUserCode(usercode);
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                Asserts.fail("密码错误");
            }
            if(!userDetails.isEnabled()){
                Asserts.fail("账号已禁用");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
            insertLoginLog(usercode);
        }catch (AuthenticationException e){
            LOGGER.warn("登录异常：{}",e.getMessage());
        }
        if(token !=null ){
            List<Role> roleList = userRoleRelationDao.getRoleListByCode(usercode);
            loginDto.setToken(token);
            loginDto.setRoleList(roleList);
        }
        return loginDto;
    }

    /**
     * 添加登录记录
     * @param usercode 用户名
     */
    private void insertLoginLog(String usercode) {
        User user = getUserByUserCode(usercode);
        if(user==null) return;
        UserLoginLog loginLog = new UserLoginLog();
        loginLog.setId(PKeyGenerator.generator());
        loginLog.setUserId(user.getId());
        loginLog.setCreateTime(new Date());
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        loginLog.setIp(RequestUtil.getRequestIp(request));
        loginLogMapper.insert(loginLog);
    }


    @Override
    public String refreshToken(String oldToken) {
        return jwtTokenUtil.refreshHeadToken(oldToken);
    }

    @Override
    public User getItem(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if(!StrUtil.isEmpty(keyword)){
            criteria.andUserCodeLike("%"+keyword+"%");
        }
        return userMapper.selectByExample(userExample);
    }

    @Override
    public int update(User user) {
        User userObject = userMapper.selectByPrimaryKey(user.getId());
        if(userObject.getPassword().equals(user.getPassword())){
            //与原密码相同不需要修改
            user.setPassword(null);
        }else {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        }
        int count = userMapper.updateByPrimaryKeySelective(user);
        getCacheService().delUser(user.getId());
        return count;
    }

    @Override
    public int delete(Long id) {
        getCacheService().delUser(id);
        int count = userMapper.deleteByPrimaryKey(id);
        getCacheService().delResourceList(id);
        return count;
    }

    @Override
    public int updateRole(Long user_id, List<Long> roleIds) {
        int count = roleIds==null?0: roleIds.size();
        //删除原来的关系
        UserRoleRelationExample userRoleRelationExample = new UserRoleRelationExample();
        userRoleRelationExample.createCriteria().andUserIdEqualTo(user_id);
        userRoleRelationMapper.deleteByExample(userRoleRelationExample);
        //建立新关系
        if(!CollectionUtils.isEmpty(roleIds)){
            ArrayList<UserRoleRelation> list = new ArrayList<>(8);
            for (Long roleId : roleIds) {
                UserRoleRelation userRoleRelation = new UserRoleRelation();
                userRoleRelation.setId(PKeyGenerator.generator());
                userRoleRelation.setUserId(user_id);
                userRoleRelation.setRoleId(roleId);
                list.add(userRoleRelation);
            }
            userRoleRelationDao.insertList(list);
        }
        getCacheService().delResourceList(user_id);
        return count;
    }

    @Override
    public List<Role> getRoleList(Long userid) {
        return userRoleRelationDao.getRoleList(userid);
    }

    @Override
    public List<UserResource> getResourceList(Long userId) {
        List<UserResource> resourceList = getCacheService().getResourceList(userId);
        if(CollUtil.isNotEmpty(resourceList)){
            return resourceList;
        }
        resourceList = userRoleRelationDao.getResourceList(userId);
        if(CollUtil.isNotEmpty(resourceList)){
            getCacheService().setResourceList(userId,resourceList);
        }
        return resourceList;
    }

    @Override
    public int updatePassword(UpdateUserPasswordParam updatePasswordParam) {
        if(StrUtil.isEmpty(updatePasswordParam.getUserCode())
                ||StrUtil.isEmpty(updatePasswordParam.getOldPassword())
                ||StrUtil.isEmpty(updatePasswordParam.getNewPassword())){
            return -1;
        }
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsercodeEqualTo(updatePasswordParam.getUserCode());
        List<User> userList = userMapper.selectByExample(userExample);
        if(CollUtil.isEmpty(userList)){
            return -2;
        }
        User user = userList.get(0);
        if(!passwordEncoder.matches(updatePasswordParam.getOldPassword(),user.getPassword())){
            return -3;
        }
        user.setPassword(passwordEncoder.encode(updatePasswordParam.getNewPassword()));
        userMapper.updateByPrimaryKey(user);
        getCacheService().delUser(user.getId());
        return 1;
    }

    @Override
    public UserDetails loadUserByUserCode(String usercode) {
        //获取用户信息
        User user = getUserByUserCode(usercode);
        if(user!=null){
            List<UserResource> resourceList = getResourceList(user.getId());
            return new HeyueUserDetails(user,resourceList);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    @Override
    public UserCacheService getCacheService() {
        return SpringUtil.getBean(UserCacheService.class);
    }
}

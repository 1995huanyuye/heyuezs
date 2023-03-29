package com.heyue.serivce.impl;

import cn.hutool.core.collection.CollUtil;
import com.heyue.dao.UserRoleRelationDao;
import com.heyue.mapper.UserRoleRelationMapper;
import com.heyue.model.User;
import com.heyue.model.UserResource;
import com.heyue.model.UserRoleRelation;
import com.heyue.model.UserRoleRelationExample;
import com.heyue.serivce.UserAdminService;
import com.heyue.serivce.UserCacheService;
import com.heyue.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 后台用户缓存操作Service实现类
 */
@Service
public class UserCacheServiceImpl implements UserCacheService {
    @Autowired
    private UserAdminService userAdminService;
    @Autowired
    private RedisService redisService;
    @Autowired
    private UserRoleRelationMapper userRoleRelationMapper;
    @Autowired
    private UserRoleRelationDao userRoleRelationDao;
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.admin}")
    private String REDIS_KEY_USER;
    @Value("${redis.key.resourceList}")
    private String REDIS_KEY_RESOURCE_LIST;
    @Override
    public void delUser(Long userid) {
        User user = userAdminService.getItem(userid);
        if(user!=null){
            String key = REDIS_DATABASE+":"+REDIS_KEY_USER+":"+user.getUserCode();
            redisService.del(key);
        }
    }

    @Override
    public void delResourceList(Long userid) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_RESOURCE_LIST+":"+userid;
        redisService.del(key);
    }

    @Override
    public void delResourceListByRole(Long roleId) {
        UserRoleRelationExample userRoleRelationExample = new UserRoleRelationExample();
        userRoleRelationExample.createCriteria().andRoleIdEqualTo(roleId);
        List<UserRoleRelation> userRoleRelationList = userRoleRelationMapper.selectByExample(userRoleRelationExample);
        if(CollUtil.isNotEmpty(userRoleRelationList)){
            String keyPrefix = REDIS_DATABASE+":"+REDIS_KEY_RESOURCE_LIST+":";
            List<String> keys = userRoleRelationList.stream().map(userRoleRelation -> keyPrefix + userRoleRelation.getUserId()).collect(Collectors.toList());
            redisService.del(keys);
        }
    }

    @Override
    public void delResourceListByRoleIds(List<Long> roleIds) {
        UserRoleRelationExample userRoleRelationExample = new UserRoleRelationExample();
        userRoleRelationExample.createCriteria().andRoleIdIn(roleIds);
        List<UserRoleRelation> userRoleRelationList = userRoleRelationMapper.selectByExample(userRoleRelationExample);
        if(CollUtil.isNotEmpty(userRoleRelationList)){
            String keyPrefix = REDIS_DATABASE+":"+REDIS_KEY_RESOURCE_LIST+":";
            List<String> keys = userRoleRelationList.stream().map(relation -> keyPrefix + relation.getUserId()).collect(Collectors.toList());
            redisService.del(keys);
        }
    }

    @Override
    public void delResourceListByResource(Long resourceId) {
        List<Long> userIdList = userRoleRelationDao.getUserIdList(resourceId);
        if(CollUtil.isNotEmpty(userIdList)){
            String keyPrefix = REDIS_DATABASE + ":" + REDIS_KEY_RESOURCE_LIST + ":";
            List<String> keys = userIdList.stream().map(userId -> keyPrefix + userId).collect(Collectors.toList());
            redisService.del(keys);
        }
    }

    @Override
    public User getUser(String userCode) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_USER+":"+userCode;
        User user = (User) redisService.get(key);
        return user;
    }

    @Override
    public void setUser(User user) {
        String key =  REDIS_DATABASE+":"+REDIS_KEY_USER+":"+user.getUserCode();
        redisService.set(key,user,REDIS_EXPIRE);
    }

    @Override
    public List<UserResource> getResourceList(Long userid) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_RESOURCE_LIST+":"+userid;
        List<UserResource> list = (List<UserResource>) redisService.get(key);
        return list;
    }

    @Override
    public void setResourceList(Long userId, List<UserResource> resourceList) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_RESOURCE_LIST+":"+userId;
        redisService.set(key,resourceList,REDIS_EXPIRE);
    }
}

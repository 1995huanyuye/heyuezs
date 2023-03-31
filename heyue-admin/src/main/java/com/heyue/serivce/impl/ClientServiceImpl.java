package com.heyue.serivce.impl;

import com.heyue.dao.ClientDao;
import com.heyue.dto.ClientAddParam;
import com.heyue.dto.ClientDetailParam;
import com.heyue.dto.ClientFollowinfoParam;
import com.heyue.dto.ClientParam;
import com.heyue.mapper.ClientDetailMapper;
import com.heyue.mapper.ClientFollowinfoMapper;
import com.heyue.mapper.ClientMapper;
import com.heyue.model.*;
import com.heyue.security.util.SpringUtil;
import com.heyue.serivce.ClientCacheService;
import com.heyue.serivce.ClientService;
import com.heyue.serivce.UserCacheService;
import com.heyue.util.PKeyGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientMapper clientMapper;

    @Autowired
    private ClientDetailMapper detailMapper;

    @Autowired
    private ClientFollowinfoMapper followinfoMapper;

    @Autowired
    private ClientDao clientDao;

    @Override
    public List<Client> listAll() {
        return clientMapper.selectByExample(new ClientExample());
    }

    @Override
    public int addClient(ClientAddParam param) {
        Long client_id = PKeyGenerator.generator();
        ClientParam clientParam = param.getClientParam();
        ClientDetailParam detailParam = param.getDetailParam();
        ClientFollowinfoParam followinfoParam = param.getFollowinfoParam();
        Client client = new Client();
        ClientDetail clientDetail = new ClientDetail();
        ClientFollowinfo clientFollowinfo = new ClientFollowinfo();
        BeanUtils.copyProperties(clientParam,client);
        BeanUtils.copyProperties(detailParam,clientDetail);
        BeanUtils.copyProperties(followinfoParam,clientFollowinfo);
        client.setId(client_id);
        client.setCreationtime(new Date());
        clientDetail.setId(PKeyGenerator.generator());
        clientDetail.setClientId(client_id);
        clientFollowinfo.setId(PKeyGenerator.generator());
        clientFollowinfo.setClientId(client_id);
        clientMapper.insert(client);
        detailMapper.insert(clientDetail);
        followinfoMapper.insert(clientFollowinfo);
        return 1;
    }

    @Override
    public int updateClient(ClientAggVO vo) {
        Client client = vo.getClient();
        ClientDetail clientDetail = vo.getClientDetail();
        ClientFollowinfo clientFollowinfo = vo.getClientFollowinfo();
        if(client!=null){
            getCacheService().delClient(vo.getClient().getId());
            clientMapper.updateByPrimaryKeySelective(client);
        }
        if(clientDetail!=null){
            detailMapper.updateByPrimaryKeySelective(clientDetail);
        }
        if(clientFollowinfo!=null){
            followinfoMapper.updateByPrimaryKeySelective(clientFollowinfo);
        }
        getCacheService().setClient(vo);
        return 1;
    }

    @Override
    public int deleteClient(Long client_id) {
        //删除缓存
        getCacheService().delClient(client_id);
        //删库
        ClientAggVO clientAggVO = loadUserByClientId(client_id);
        clientMapper.deleteByPrimaryKey(client_id);
        detailMapper.deleteByPrimaryKey(clientAggVO.getClientDetail().getId());
        followinfoMapper.deleteByPrimaryKey(clientAggVO.getClientFollowinfo().getId());
        return 1;
    }

    @Override
    public ClientAggVO queryClientInfo(Long client_id) {
        //先取缓存
        ClientAggVO vo = getCacheService().getClient(client_id);
        if(vo!=null){
            return vo;
        }
        //缓存取不到
        Client client = clientMapper.selectByPrimaryKey(client_id);
        ClientDetailExample clientDetailExample = new ClientDetailExample();
        clientDetailExample.createCriteria().andClientIdEqualTo(client_id);
        List<ClientDetail> clientDetails = detailMapper.selectByExample(clientDetailExample);
        ClientFollowinfoExample clientFollowinfoExample = new ClientFollowinfoExample();
        clientFollowinfoExample.createCriteria().andClientIdEqualTo(client_id);
        List<ClientFollowinfo> clientFollowinfos = followinfoMapper.selectByExample(clientFollowinfoExample);
        ClientAggVO clientAggVO = new ClientAggVO();
        clientAggVO.setClient(client);
        if(clientDetails.size()>0){
            clientAggVO.setClientDetail(clientDetails.get(0));
        }
        if(clientFollowinfos.size()>0){
            clientAggVO.setClientFollowinfo(clientFollowinfos.get(0));
        }
        //放入缓存
        getCacheService().setClient(clientAggVO);
        return clientAggVO;
    }

    @Override
    public ClientAggVO loadUserByClientId(Long client_id) {
        return queryClientInfo(client_id);
    }

    @Override
    public ClientCacheService getCacheService() {
        return SpringUtil.getBean(ClientCacheService.class);
    }
}

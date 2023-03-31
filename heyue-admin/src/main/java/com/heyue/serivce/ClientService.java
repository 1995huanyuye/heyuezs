package com.heyue.serivce;

import com.heyue.dto.ClientAddParam;
import com.heyue.dto.ClientParam;
import com.heyue.model.Client;
import com.heyue.model.ClientAggVO;
import com.heyue.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ClientService {
    /**
     * 获取所有客户
     */
    List<Client> listAll();

    /**
     * 添加客户
     */
    @Transactional
    int addClient(ClientAddParam param);

    /**
     * 更新客户信息
     */
    int updateClient(ClientAggVO vo);
    /**
     * 删除客户
     */
    int deleteClient(Long id);
    /**
     * 查询指定客户
     */
    ClientAggVO queryClientInfo(Long client_id);

    /**
     * 获取用户信息
     */
    ClientAggVO loadUserByClientId(Long client_id);

    /**
     * 获取缓存服务
     */
    ClientCacheService getCacheService();
}

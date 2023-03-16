package com.heyue.serivce;

import com.heyue.model.Client;
import com.heyue.model.User;

import java.util.List;

public interface ClientService {
    /**
     * 获取所有客户
     */
    List<Client> listAll();

    /**
     * 添加客户
     */
    int addClient(Client client);

    /**
     * 更新客户信息
     */
    int updateClient(Client client);
    /**
     * 删除客户
     */
    int deleteClient(Long id);
}

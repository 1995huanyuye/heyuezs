package com.heyue.serivce.impl;

import com.heyue.mapper.ClientMapper;
import com.heyue.model.Client;
import com.heyue.model.ClientExample;
import com.heyue.model.User;
import com.heyue.serivce.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientMapper clientMapper;

    @Override
    public List<Client> listAll() {
        return clientMapper.selectByExample(new ClientExample());
    }

    @Override
    public int addClient(Client client) {
        return clientMapper.insert(client);
    }

    @Override
    public int updateClient(Client client) {
        return clientMapper.updateByPrimaryKey(client);
    }

    @Override
    public int deleteClient(Long id) {
        return clientMapper.deleteByPrimaryKey(id);
    }
}

package com.heyue.serivce.impl;

import com.heyue.model.ClientAggVO;
import com.heyue.serivce.ClientCacheService;
import com.heyue.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 后台客户缓存操作Service实现类
 */
@Service
public class ClientCacheServiceImpl implements ClientCacheService {
    @Autowired
    private RedisService redisService;
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.client}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.client}")
    private String REDIS_KEY_CLIENT;

    @Override
    public void delClient(Long client_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_CLIENT+":"+client_id;
        redisService.del(key);
    }
    @Override
    public ClientAggVO getClient(Long client_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_CLIENT+":"+client_id;
        ClientAggVO vo = (ClientAggVO) redisService.get(key);
        return vo;
    }

    @Override
    public void setClient(ClientAggVO clientAggVO) {
        String key =  REDIS_DATABASE+":"+REDIS_KEY_CLIENT+":"+clientAggVO.getClient().getId();
        redisService.set(key,clientAggVO,REDIS_EXPIRE);
    }

}

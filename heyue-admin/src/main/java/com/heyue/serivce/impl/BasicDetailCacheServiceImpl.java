package com.heyue.serivce.impl;

import com.heyue.model.BasicDetail;
import com.heyue.serivce.BasicDetailCacheService;
import com.heyue.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicDetailCacheServiceImpl implements BasicDetailCacheService {

    @Autowired
    private RedisService redisService;
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.basicdetail}")
    private String REDIS_KEY_BASICDETAIL;
    @Value("${redis.key.basicdetailall}")
    private String REDIS_KEY_BASICDETAILALL;

    @Override
    public void delBasicDetail(Long detail_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_BASICDETAIL+":"+detail_id;
        redisService.del(key);
    }

    @Override
    public void setBasicDetail(BasicDetail detail) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_BASICDETAIL+":"+detail.getId();
        redisService.set(key,detail,REDIS_EXPIRE);
    }

    @Override
    public BasicDetail getBasicDetail(Long detail_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_BASICDETAIL+":"+detail_id;
        BasicDetail detail = (BasicDetail) redisService.get(key);
        return detail;
    }

    @Override
    public List<BasicDetail> getAll(Long category_id,String isHaveParent) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_BASICDETAILALL+":"+category_id+":"+isHaveParent;
        List<BasicDetail> list = (List<BasicDetail>) redisService.get(key);
        return list;
    }

    @Override
    public void setAll(List<BasicDetail> list, Long category_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_BASICDETAILALL+":"+category_id;
        redisService.set(key,list,REDIS_EXPIRE);
    }

    @Override
    public void delAll(Long category_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_BASICDETAILALL+":"+category_id;
        redisService.del(key);
    }

}

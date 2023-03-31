package com.heyue.serivce.impl;

import com.heyue.model.BasicCategory;
import com.heyue.serivce.BasicCategoryCacheService;
import com.heyue.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicCategoryCacheServiceImpl implements BasicCategoryCacheService {

    @Autowired
    private RedisService redisService;
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.basiccategory}")
    private String REDIS_KEY_BASICCATEGORY;
    @Value("${redis.key.basiccategoryall}")
    private String REDIS_KEY_BASICCATEGORYALL;


    @Override
    public void delBasicCategory(Long category_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_BASICCATEGORY+":"+category_id;
        redisService.del(key);
    }

    @Override
    public void setBasicCategory(BasicCategory category) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_BASICCATEGORY+":"+category.getId();
        redisService.set(key,category,REDIS_EXPIRE);
    }

    @Override
    public BasicCategory getBasicCategory(Long category_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_BASICCATEGORY+":"+category_id;
        BasicCategory category = (BasicCategory) redisService.get(key);
        return category;
    }

    @Override
    public List<BasicCategory> getAll() {
        String key = REDIS_DATABASE+":"+REDIS_KEY_BASICCATEGORYALL;
        List<BasicCategory> list = (List<BasicCategory>) redisService.get(key);
        return list;
    }

    @Override
    public void setAll(List<BasicCategory> list) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_BASICCATEGORYALL;
        redisService.set(key,list,REDIS_EXPIRE);
    }

    @Override
    public void delAll() {
        String key = REDIS_DATABASE+":"+REDIS_KEY_BASICCATEGORYALL;
        redisService.del(key);
    }
}

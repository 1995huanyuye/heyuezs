package com.heyue.serivce.impl;

import com.heyue.model.MaterialCategory;
import com.heyue.serivce.MaterialCategoryCacheService;
import com.heyue.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialCategoryCacheServiceImpl implements MaterialCategoryCacheService {
    @Autowired
    private RedisService redisService;
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.materialcategory}")
    private String REDIS_KEY_MATERIALCATEGORY;
    @Value("${redis.key.materialcategoryall}")
    private String REDIS_KEY_MATERIALCATEGORYALL;

    @Override
    public void delMaterialCategory(Long category_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_MATERIALCATEGORY+":"+category_id;
        redisService.del(key);
    }

    @Override
    public void setMaterialCategory(MaterialCategory category) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_MATERIALCATEGORY+":"+category.getId();
        redisService.set(key,category,REDIS_EXPIRE);
    }

    @Override
    public MaterialCategory getMaterialCategory(Long category_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_MATERIALCATEGORY+":"+category_id;
        MaterialCategory category = (MaterialCategory) redisService.get(key);
        return category;
    }

    @Override
    public List<MaterialCategory> getAll() {
        String key = REDIS_DATABASE+":"+REDIS_KEY_MATERIALCATEGORYALL;
        List<MaterialCategory> list = (List<MaterialCategory>) redisService.get(key);
        return list;
    }

    @Override
    public void setAll(List<MaterialCategory> list) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_MATERIALCATEGORYALL;
        redisService.set(key,list,REDIS_EXPIRE);
    }

    @Override
    public void delAll() {
        String key = REDIS_DATABASE+":"+REDIS_KEY_MATERIALCATEGORYALL;
        redisService.del(key);
    }
}

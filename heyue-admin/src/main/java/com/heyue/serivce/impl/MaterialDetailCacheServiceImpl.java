package com.heyue.serivce.impl;

import com.heyue.model.MaterialDetail;
import com.heyue.serivce.MaterialDetailCacheService;
import com.heyue.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialDetailCacheServiceImpl implements MaterialDetailCacheService {
    @Autowired
    private RedisService redisService;
    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.materialdetail}")
    private String REDIS_KEY_MATERIALDETAIL;
    @Value("${redis.key.materialdetailall}")
    private String REDIS_KEY_MATERIALDETAILALL;

    @Override
    public void delMaterialDetail(Long detail_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_MATERIALDETAIL+":"+detail_id;
        redisService.del(key);
    }

    @Override
    public void setMaterialDetail(MaterialDetail detail) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_MATERIALDETAIL+":"+detail.getId();
        redisService.set(key,detail,REDIS_EXPIRE);
    }

    @Override
    public MaterialDetail getMaterialDetail(Long detail_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_MATERIALDETAIL+":"+detail_id;
        MaterialDetail materialDetail = (MaterialDetail) redisService.get(key);
        return materialDetail;
    }

    @Override
    public List<MaterialDetail> getAll(Long category_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_MATERIALDETAILALL+":"+category_id;
        List<MaterialDetail> list = (List<MaterialDetail>) redisService.get(key);
        return list;
    }

    @Override
    public void setAll(List<MaterialDetail> list, Long category_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_MATERIALDETAILALL+":"+category_id;
        redisService.set(key,list,REDIS_EXPIRE);
    }

    @Override
    public void delAll(Long category_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_MATERIALDETAILALL+":"+category_id;
        redisService.del(key);
    }
}

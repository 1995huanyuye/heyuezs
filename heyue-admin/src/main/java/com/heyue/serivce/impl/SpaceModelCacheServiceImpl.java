package com.heyue.serivce.impl;

import com.heyue.dto.SpaceTemplateAgg;
import com.heyue.model.SpaceItem;
import com.heyue.serivce.SpaceModelCacheService;
import com.heyue.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceModelCacheServiceImpl implements SpaceModelCacheService {
    @Autowired
    private RedisService redisService;

    @Value("${redis.database}")
    private String REDIS_DATABASE;
    @Value("${redis.expire.common}")
    private Long REDIS_EXPIRE;
    @Value("${redis.key.spaceitemdata}")
    private String REDIS_KEY_SPACEITEMDATA;
    @Value("${redis.key.spaceitem}")
    private String REDIS_KEY_SPACEITEM;
    @Override
    public void delSpaceItem(Long id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_SPACEITEMDATA+":"+id;
        redisService.del(key);
    }

    @Override
    public void setSpaceItem(SpaceTemplateAgg vo) {
        Long id = vo.getId();
        String key = REDIS_DATABASE+":"+REDIS_KEY_SPACEITEMDATA+":"+id;
        redisService.set(key,vo,REDIS_EXPIRE);
    }

    @Override
    public SpaceTemplateAgg getSpaceItemData(Long id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_SPACEITEMDATA+":"+id;
        SpaceTemplateAgg agg = (SpaceTemplateAgg) redisService.get(key);
        return agg;
    }

    @Override
    public List<SpaceItem> getAll(Long category_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_SPACEITEM+":"+category_id;
        List<SpaceItem> list = (List<SpaceItem>) redisService.get(key);
        return list;
    }

    @Override
    public void setAll(List<SpaceItem> list, Long category_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_SPACEITEM+":"+category_id;
        redisService.set(key,list,REDIS_EXPIRE);
    }

    @Override
    public void delAll(Long category_id) {
        String key = REDIS_DATABASE+":"+REDIS_KEY_SPACEITEM+":"+category_id;
        redisService.del(key);
    }
}

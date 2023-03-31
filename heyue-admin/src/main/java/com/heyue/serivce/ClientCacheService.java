package com.heyue.serivce;

import com.heyue.model.ClientAggVO;
import com.heyue.model.User;

public interface ClientCacheService {
    /**
     * 获取缓存后台客户信息
     */
    ClientAggVO getClient(Long client_id);

    /**
     * 设置缓存后台客户信息
     */
    void setClient(ClientAggVO clientAggVO);

    /**
     * 删除后台客户缓存
     */
    void delClient(Long client_id);
}

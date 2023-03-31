package com.heyue.serivce;

import com.heyue.model.BasicDetail;

import java.util.List;

/**
 *  基装定额缓存service
 */
public interface BasicDetailCacheService {

    void delBasicDetail(Long detail_id);

    void setBasicDetail(BasicDetail detail);

    BasicDetail getBasicDetail(Long detail_id);

    List<BasicDetail> getAll(Long category_id);

    void setAll(List<BasicDetail> list,Long category_id);

    void delAll(Long category_id);
}

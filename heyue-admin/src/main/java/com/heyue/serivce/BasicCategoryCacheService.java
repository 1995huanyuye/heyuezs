package com.heyue.serivce;

import com.heyue.model.BasicCategory;

import java.util.List;


/**
 *  基装定额目录缓存service
 */
public interface BasicCategoryCacheService {

    void delBasicCategory(Long category_id);

    void setBasicCategory(BasicCategory category);

    BasicCategory getBasicCategory(Long category_id);

    List<BasicCategory> getAll();

    void setAll(List<BasicCategory> list);

    void delAll();
}


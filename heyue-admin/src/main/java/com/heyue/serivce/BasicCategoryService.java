package com.heyue.serivce;

import com.heyue.dto.BasicCategoryParam;
import com.heyue.dto.BasicCategoryUpdateParam;
import com.heyue.model.BasicCategory;
import com.heyue.model.Client;

import java.util.List;

public interface BasicCategoryService {


    /**
     * 获取所有类别
     */
    List<BasicCategory> listAll();

    BasicCategory queryCategory(Long category_id);
    /**
     * 新增基装类别
     */
    int addBasicCategory(BasicCategoryParam param);
    /**
     * 更新基装类别信息
     */
    int updateBasicCategory(BasicCategoryUpdateParam category);
    /**
     * 删除类别
     */
    int deleteBasicCategory(Long category_id);

    BasicCategory loadCategoryById(Long category_id);

    BasicCategoryCacheService getCacheService();

}

package com.heyue.serivce;

import com.heyue.model.BasicCategory;
import com.heyue.model.Client;

import java.util.List;

public interface BasicCategoryService {


    /**
     * 获取所有类别
     */
    List<BasicCategory> listAll();
    /**
     * 新增基装类别
     */
    int addBasicCategory(BasicCategory category);
    /**
     * 更新基装类别信息
     */
    int updateBasicCategory(BasicCategory category);
    /**
     * 删除类别
     */
    int deleteBasicCategory(Long id);

}

package com.heyue.serivce;

import com.heyue.dto.SpaceCategoryParam;
import com.heyue.model.BasicCategory;
import com.heyue.model.SpaceCategory;

import java.util.List;

/**
 *空间模板类别
 */
public interface SpaceCategoryService{
    /**
     * 获取所有类别
     */
    List<SpaceCategory> listAll();

    SpaceCategory queryCategory(Long category_id);
    /**
     * 新增基装类别
     */
    int addSpaceCategory(SpaceCategoryParam param);
    /**
     * 更新基装类别信息
     */
    int updateSpaceCategory(SpaceCategory category);
    /**
     * 删除类别
     */
    int deleteSpaceCategory(Long category_id);
}

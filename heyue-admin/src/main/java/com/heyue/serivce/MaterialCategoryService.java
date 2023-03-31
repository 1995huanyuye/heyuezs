package com.heyue.serivce;

import com.heyue.dto.MaterialCategoryParam;
import com.heyue.model.BasicCategory;
import com.heyue.model.MaterialCategory;

import java.util.List;

public interface MaterialCategoryService {
    /**
     * 获取材料类型
     */
    List<MaterialCategory> listAll();

    MaterialCategory queryCategory(Long category_id);
    /**
     * 新增材料类别
     */
    int addMaterialCategory(MaterialCategoryParam param);
    /**
     * 更新材料类别信息
     */
    int updateMaterialCategory(MaterialCategory category);
    /**
     * 删除材料类别
     */
    int deleteMaterialCategory(Long id);

    MaterialCategory loadCategoryById(Long category_id);

    MaterialCategoryCacheService getCacheService();
}

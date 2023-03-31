package com.heyue.serivce;

import com.heyue.model.MaterialCategory;

import java.util.List;

public interface MaterialCategoryCacheService {
    void delMaterialCategory(Long category_id);

    void setMaterialCategory(MaterialCategory category);

    MaterialCategory getMaterialCategory(Long category_id);

    List<MaterialCategory> getAll();

    void setAll(List<MaterialCategory> list);

    void delAll();
}

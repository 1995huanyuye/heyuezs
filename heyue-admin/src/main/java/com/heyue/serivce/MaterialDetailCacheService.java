package com.heyue.serivce;

import com.heyue.model.BasicDetail;
import com.heyue.model.MaterialDetail;

import java.util.List;

/**
 *  材料定额缓存service
 */
public interface MaterialDetailCacheService {

    void delMaterialDetail(Long detail_id);

    void setMaterialDetail(MaterialDetail detail);

    MaterialDetail getMaterialDetail(Long detail_id);

    List<MaterialDetail> getAll(Long category_id);

    void setAll(List<MaterialDetail> list,Long category_id);

    void delAll(Long category_id);
}

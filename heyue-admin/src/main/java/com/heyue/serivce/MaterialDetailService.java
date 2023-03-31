package com.heyue.serivce;

import com.heyue.dto.MaterialDetailParam;
import com.heyue.model.BasicDetail;
import com.heyue.model.MaterialDetail;

import java.util.List;

public interface MaterialDetailService {
    /**
     * 获取材料定额
     */
    List<MaterialDetail> listAll(Long catedory_id,String isHaveParent);
    /**
     * 获取材料定额
     */
    MaterialDetail getItem(Long id);
    /**
     * 新增材料定额
     */
    int addMaterialDetail(MaterialDetailParam param,Long category_id);
    /**
     * 更新材料定额信息
     */
    int updateMaterialDetail(MaterialDetail detail);
    /**
     * 删除类别
     */
    int deleteMaterialDetail(Long id);

    /**
     * 材料定额信息
     */
    MaterialDetail loadMaterialDetailById(Long id);

    MaterialDetailCacheService getCacheService();
}

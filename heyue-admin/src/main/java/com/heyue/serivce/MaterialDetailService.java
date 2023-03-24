package com.heyue.serivce;

import com.heyue.model.MaterialDetail;

import java.util.List;

public interface MaterialDetailService {
    /**
     * 获取基装类型
     */
    List<MaterialDetail> listAll();
    /**
     * 新增基装类别
     */
    int addMaterialDetail(MaterialDetail detail);
    /**
     * 更新基装类别信息
     */
    int updateMaterialDetail(MaterialDetail detail);
    /**
     * 删除类别
     */
    int deleteMaterialDetail(Long id);
}

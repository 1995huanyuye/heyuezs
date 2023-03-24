package com.heyue.serivce;

import com.heyue.model.BasicCategory;
import com.heyue.model.BasicDetail;

import java.util.List;

public interface BasicDetailService {

    /**
     * 获取基装类型
     */
    List<BasicDetail> listAll();
    /**
     * 新增基装类别
     */
    int addBasicDetail(BasicDetail category);
    /**
     * 更新基装类别信息
     */
    int updateBasicDetail(BasicDetail category);
    /**
     * 删除类别
     */
    int deleteBasicDetail(Long id);
}

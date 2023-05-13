package com.heyue.serivce;

import com.heyue.dto.BasicDetailParam;
import com.heyue.dto.ItemVOParm;
import com.heyue.model.BasicCategory;
import com.heyue.model.BasicDetail;
import com.heyue.model.ItemVO;

import java.util.List;

public interface BasicDetailService {

    /**
     * 获取目录下所有基装定额
     */
    List<BasicDetail> listAll(Long catedory_id);
    /**
     * 获取基装定额
     */
    BasicDetail getItem(Long id);
    /**
     * 新增基装定额
     */
    int addBasicDetail(BasicDetailParam param,Long category_id);
    /**
     * 更新基装定额
     */
    int updateBasicDetail(BasicDetail detail);
    /**
     * 删除基装定额
     */
    int deleteBasicDetail(Long id);
    /**
     * 基装定额详细信息
     */
    BasicDetail loadBasicDetailById(Long id);

    BasicDetailCacheService getCacheService();

    List<ItemVO> listBasicAll();

    void insertBasic(ItemVOParm item);

    void updateBasic (List<ItemVO> list);


}

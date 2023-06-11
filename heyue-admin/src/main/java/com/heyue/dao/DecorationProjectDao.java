package com.heyue.dao;

import com.heyue.model.DecorationProject;
import com.heyue.model.SpaceItemConfig;

import java.util.List;

public interface DecorationProjectDao {
    int addDecorationParam(DecorationProject param);

    int batchAddSpaceItemConfig(List<SpaceItemConfig> list);
    void delDecorationParam(Long id);

    void delDecorationParamByItemId(Long spaceItemId);

    int updateDecorationParam(DecorationProject vo);

    List<DecorationProject> listDecorationParam(Integer projectType);
}

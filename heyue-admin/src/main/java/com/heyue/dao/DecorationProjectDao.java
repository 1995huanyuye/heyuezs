package com.heyue.dao;

import com.heyue.model.DecorationProject;
import com.heyue.model.SpaceItemConfig;

import java.util.List;

public interface DecorationProjectDao {
    int addDecorationParam(DecorationProject param);

    int batchAddSpaceItemConfig(List<SpaceItemConfig> list);
    List<SpaceItemConfig> querySpaceItemConfig(Long id);
    int updateSpaceItemConfig(SpaceItemConfig param);
    void delDecorationParam(Long id);

    void delDecorationParamByItemId(Long spaceItemId);

    int updateDecorationParam(DecorationProject vo);
    List<DecorationProject> listDecorationParam(Integer projectType);
    int selectCountBySpaceItemConfigId(Long id);
}

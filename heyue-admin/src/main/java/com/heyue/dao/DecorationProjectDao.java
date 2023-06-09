package com.heyue.dao;

import com.heyue.model.DecorationProject;

import java.util.List;

public interface DecorationProjectDao {
    int addDecorationParam(DecorationProject param);

    void delDecorationParam(Long id);

    int updateDecorationParam(DecorationProject vo);

    List<DecorationProject> listDecorationParam(Integer projectType);
}

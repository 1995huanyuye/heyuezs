package com.heyue.serivce.impl;

import com.heyue.mapper.MaterialDetailMapper;
import com.heyue.model.MaterialDetail;
import com.heyue.model.MaterialDetailExample;
import com.heyue.serivce.MaterialDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialDetailImpl implements MaterialDetailService {
    @Autowired
    private MaterialDetailMapper mapper;
    @Override
    public List<MaterialDetail> listAll() {
        return mapper.selectByExample(new MaterialDetailExample());
    }

    @Override
    public int addMaterialDetail(MaterialDetail detail) {
        return mapper.insert(detail);
    }

    @Override
    public int updateMaterialDetail(MaterialDetail detail) {
        return mapper.updateByPrimaryKey(detail);
    }

    @Override
    public int deleteMaterialDetail(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }
}

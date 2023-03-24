package com.heyue.serivce.impl;

import com.heyue.mapper.BasicDetailMapper;
import com.heyue.model.BasicDetail;
import com.heyue.model.BasicDetailExample;
import com.heyue.serivce.BasicDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicDetailImpl implements BasicDetailService {
    @Autowired
    private BasicDetailMapper mapper;
    @Override
    public List<BasicDetail> listAll() {
        return mapper.selectByExample(new BasicDetailExample());
    }

    @Override
    public int addBasicDetail(BasicDetail detail) {
        return mapper.insert(detail);
    }

    @Override
    public int updateBasicDetail(BasicDetail detail) {
        return mapper.updateByPrimaryKey(detail);
    }

    @Override
    public int deleteBasicDetail(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }
}

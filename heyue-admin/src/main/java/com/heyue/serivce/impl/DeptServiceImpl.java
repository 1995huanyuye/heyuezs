package com.heyue.serivce.impl;

import com.heyue.mapper.DeptMapper;
import com.heyue.model.Dept;
import com.heyue.model.DeptExample;
import com.heyue.serivce.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> listAll() {
        return deptMapper.selectByExample(new DeptExample());
    }

    @Override
    public int addDept(Dept dept) {
        return deptMapper.insert(dept);
    }

    @Override
    public int updateDept(Dept dept) {
        return deptMapper.updateByPrimaryKey(dept);
    }

    @Override
    public int deleteDept(Long id) {
        return deptMapper.deleteByPrimaryKey(id);
    }
}

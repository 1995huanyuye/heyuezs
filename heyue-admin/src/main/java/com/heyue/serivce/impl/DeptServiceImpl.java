package com.heyue.serivce.impl;

import com.heyue.dao.DeptDao;
import com.heyue.dto.DeptParam;
import com.heyue.mapper.DeptMapper;
import com.heyue.model.Dept;
import com.heyue.model.DeptExample;
import com.heyue.serivce.DeptService;
import com.heyue.util.PKeyGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private DeptDao deptDao;
    @Override
    public List<Dept> listAll() {
        return deptMapper.selectByExample(new DeptExample());
    }

    @Override
    public int addDept(DeptParam param) {
        Dept dept = new Dept();
        BeanUtils.copyProperties(param,dept);
        dept.setId(PKeyGenerator.generator());
        //部门编码不能重复
        Dept data = queryDeptInfo(dept.getDeptCode());
        if(data!=null){
            return -1;
        }
        return deptMapper.insert(dept);
    }

    @Override
    public int updateDept(DeptParam param) {
        Dept dept = new Dept();
        BeanUtils.copyProperties(param,dept);
        return deptMapper.updateByPrimaryKey(dept);
    }

    @Override
    public int deleteDept(Long id) {
        return deptMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Dept queryDeptInfo(String deptCode) {
        DeptExample deptExample = new DeptExample();
        deptExample.createCriteria().andDeptCodeEqualTo(deptCode);
        List<Dept> deptList = deptMapper.selectByExample(deptExample);
        if(deptList.size()==0){
            return null;
        }
        return deptList.get(0);
    }
}

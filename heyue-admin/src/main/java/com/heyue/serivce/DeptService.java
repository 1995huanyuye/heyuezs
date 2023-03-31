package com.heyue.serivce;

import com.heyue.dto.DeptParam;
import com.heyue.model.Dept;
import com.heyue.model.User;

import java.util.List;

public interface DeptService {
    /**
     * 获取所有部门
     */
    List<Dept> listAll();

    /**
     * 添加部门
     */
    int addDept(DeptParam param);

    /**
     * 更新用户信息
     */
    int updateDept(DeptParam param);
    /**
     * 删除用户
     */
    int deleteDept(Long id);
    /**
     * 查询部门信息
     */
    Dept queryDeptInfo(String deptCode);
}

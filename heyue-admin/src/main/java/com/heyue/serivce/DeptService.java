package com.heyue.serivce;

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
    int addDept(Dept dept);

    /**
     * 更新用户信息
     */
    int updateDept(Dept dept);
    /**
     * 删除用户
     */
    int deleteDept(Long id);
}

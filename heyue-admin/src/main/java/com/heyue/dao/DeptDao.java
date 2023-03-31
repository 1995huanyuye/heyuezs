package com.heyue.dao;

import com.heyue.model.Dept;
/**
 * 后台部门管理自定义Dao
 */
public interface DeptDao {
  Dept queryDeptInfo(String deptCode);
}

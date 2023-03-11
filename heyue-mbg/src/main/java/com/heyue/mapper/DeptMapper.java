package com.heyue.mapper;

import com.heyue.model.Dept;
import com.heyue.model.DeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    long countByExample(DeptExample example);

    int deleteByExample(DeptExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Dept row);

    int insertSelective(Dept row);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Dept row, @Param("example") DeptExample example);

    int updateByExample(@Param("row") Dept row, @Param("example") DeptExample example);

    int updateByPrimaryKeySelective(Dept row);

    int updateByPrimaryKey(Dept row);
}
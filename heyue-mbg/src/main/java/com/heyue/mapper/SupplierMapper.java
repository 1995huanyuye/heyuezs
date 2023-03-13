package com.heyue.mapper;

import com.heyue.model.Supplier;
import com.heyue.model.SupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierMapper {
    long countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Supplier row);

    int insertSelective(Supplier row);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Supplier row, @Param("example") SupplierExample example);

    int updateByExample(@Param("row") Supplier row, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier row);

    int updateByPrimaryKey(Supplier row);
}
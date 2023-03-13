package com.heyue.mapper;

import com.heyue.model.SupplierInfo;
import com.heyue.model.SupplierInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierInfoMapper {
    long countByExample(SupplierInfoExample example);

    int deleteByExample(SupplierInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SupplierInfo row);

    int insertSelective(SupplierInfo row);

    List<SupplierInfo> selectByExample(SupplierInfoExample example);

    SupplierInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") SupplierInfo row, @Param("example") SupplierInfoExample example);

    int updateByExample(@Param("row") SupplierInfo row, @Param("example") SupplierInfoExample example);

    int updateByPrimaryKeySelective(SupplierInfo row);

    int updateByPrimaryKey(SupplierInfo row);
}
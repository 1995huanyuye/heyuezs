package com.heyue.mapper;

import com.heyue.model.MaterialDetail;
import com.heyue.model.MaterialDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialDetailMapper {
    long countByExample(MaterialDetailExample example);

    int deleteByExample(MaterialDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MaterialDetail row);

    int insertSelective(MaterialDetail row);

    List<MaterialDetail> selectByExample(MaterialDetailExample example);

    MaterialDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") MaterialDetail row, @Param("example") MaterialDetailExample example);

    int updateByExample(@Param("row") MaterialDetail row, @Param("example") MaterialDetailExample example);

    int updateByPrimaryKeySelective(MaterialDetail row);

    int updateByPrimaryKey(MaterialDetail row);
}
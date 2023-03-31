package com.heyue.mapper;

import com.heyue.model.ClientDetail;
import com.heyue.model.ClientDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientDetailMapper {
    long countByExample(ClientDetailExample example);

    int deleteByExample(ClientDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClientDetail row);

    int insertSelective(ClientDetail row);

    List<ClientDetail> selectByExample(ClientDetailExample example);

    ClientDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") ClientDetail row, @Param("example") ClientDetailExample example);

    int updateByExample(@Param("row") ClientDetail row, @Param("example") ClientDetailExample example);

    int updateByPrimaryKeySelective(ClientDetail row);

    int updateByPrimaryKey(ClientDetail row);
}
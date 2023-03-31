package com.heyue.mapper;

import com.heyue.model.ClientFollowinfo;
import com.heyue.model.ClientFollowinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientFollowinfoMapper {
    long countByExample(ClientFollowinfoExample example);

    int deleteByExample(ClientFollowinfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClientFollowinfo row);

    int insertSelective(ClientFollowinfo row);

    List<ClientFollowinfo> selectByExample(ClientFollowinfoExample example);

    ClientFollowinfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") ClientFollowinfo row, @Param("example") ClientFollowinfoExample example);

    int updateByExample(@Param("row") ClientFollowinfo row, @Param("example") ClientFollowinfoExample example);

    int updateByPrimaryKeySelective(ClientFollowinfo row);

    int updateByPrimaryKey(ClientFollowinfo row);
}
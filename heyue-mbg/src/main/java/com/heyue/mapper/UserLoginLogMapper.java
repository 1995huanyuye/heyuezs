package com.heyue.mapper;

import com.heyue.model.UserLoginLog;
import com.heyue.model.UserLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginLogMapper {
    long countByExample(UserLoginLogExample example);

    int deleteByExample(UserLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserLoginLog row);

    int insertSelective(UserLoginLog row);

    List<UserLoginLog> selectByExample(UserLoginLogExample example);

    UserLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UserLoginLog row, @Param("example") UserLoginLogExample example);

    int updateByExample(@Param("row") UserLoginLog row, @Param("example") UserLoginLogExample example);

    int updateByPrimaryKeySelective(UserLoginLog row);

    int updateByPrimaryKey(UserLoginLog row);
}
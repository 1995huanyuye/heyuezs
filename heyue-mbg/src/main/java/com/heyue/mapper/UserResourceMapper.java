package com.heyue.mapper;

import com.heyue.model.UserResource;
import com.heyue.model.UserResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserResourceMapper {
    long countByExample(UserResourceExample example);

    int deleteByExample(UserResourceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserResource row);

    int insertSelective(UserResource row);

    List<UserResource> selectByExample(UserResourceExample example);

    UserResource selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UserResource row, @Param("example") UserResourceExample example);

    int updateByExample(@Param("row") UserResource row, @Param("example") UserResourceExample example);

    int updateByPrimaryKeySelective(UserResource row);

    int updateByPrimaryKey(UserResource row);
}
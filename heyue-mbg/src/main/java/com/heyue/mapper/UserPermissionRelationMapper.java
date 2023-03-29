package com.heyue.mapper;

import com.heyue.model.UserPermissionRelation;
import com.heyue.model.UserPermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPermissionRelationMapper {
    long countByExample(UserPermissionRelationExample example);

    int deleteByExample(UserPermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserPermissionRelation row);

    int insertSelective(UserPermissionRelation row);

    List<UserPermissionRelation> selectByExample(UserPermissionRelationExample example);

    UserPermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UserPermissionRelation row, @Param("example") UserPermissionRelationExample example);

    int updateByExample(@Param("row") UserPermissionRelation row, @Param("example") UserPermissionRelationExample example);

    int updateByPrimaryKeySelective(UserPermissionRelation row);

    int updateByPrimaryKey(UserPermissionRelation row);
}
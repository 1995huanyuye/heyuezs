package com.heyue.mapper;

import com.heyue.model.UserRolePermissionRelation;
import com.heyue.model.UserRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRolePermissionRelationMapper {
    long countByExample(UserRolePermissionRelationExample example);

    int deleteByExample(UserRolePermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRolePermissionRelation row);

    int insertSelective(UserRolePermissionRelation row);

    List<UserRolePermissionRelation> selectByExample(UserRolePermissionRelationExample example);

    UserRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UserRolePermissionRelation row, @Param("example") UserRolePermissionRelationExample example);

    int updateByExample(@Param("row") UserRolePermissionRelation row, @Param("example") UserRolePermissionRelationExample example);

    int updateByPrimaryKeySelective(UserRolePermissionRelation row);

    int updateByPrimaryKey(UserRolePermissionRelation row);
}
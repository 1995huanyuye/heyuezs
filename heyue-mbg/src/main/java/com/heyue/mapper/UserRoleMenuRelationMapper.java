package com.heyue.mapper;

import com.heyue.model.UserRoleMenuRelation;
import com.heyue.model.UserRoleMenuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleMenuRelationMapper {
    long countByExample(UserRoleMenuRelationExample example);

    int deleteByExample(UserRoleMenuRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRoleMenuRelation row);

    int insertSelective(UserRoleMenuRelation row);

    List<UserRoleMenuRelation> selectByExample(UserRoleMenuRelationExample example);

    UserRoleMenuRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UserRoleMenuRelation row, @Param("example") UserRoleMenuRelationExample example);

    int updateByExample(@Param("row") UserRoleMenuRelation row, @Param("example") UserRoleMenuRelationExample example);

    int updateByPrimaryKeySelective(UserRoleMenuRelation row);

    int updateByPrimaryKey(UserRoleMenuRelation row);
}
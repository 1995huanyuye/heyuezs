package com.heyue.mapper;

import com.heyue.model.UserRoleRelation;
import com.heyue.model.UserRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleRelationMapper {
    long countByExample(UserRoleRelationExample example);

    int deleteByExample(UserRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRoleRelation row);

    int insertSelective(UserRoleRelation row);

    List<UserRoleRelation> selectByExample(UserRoleRelationExample example);

    UserRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UserRoleRelation row, @Param("example") UserRoleRelationExample example);

    int updateByExample(@Param("row") UserRoleRelation row, @Param("example") UserRoleRelationExample example);

    int updateByPrimaryKeySelective(UserRoleRelation row);

    int updateByPrimaryKey(UserRoleRelation row);
}
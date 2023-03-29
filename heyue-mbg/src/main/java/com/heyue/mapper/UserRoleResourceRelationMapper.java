package com.heyue.mapper;

import com.heyue.model.UserRoleResourceRelation;
import com.heyue.model.UserRoleResourceRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleResourceRelationMapper {
    long countByExample(UserRoleResourceRelationExample example);

    int deleteByExample(UserRoleResourceRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRoleResourceRelation row);

    int insertSelective(UserRoleResourceRelation row);

    List<UserRoleResourceRelation> selectByExample(UserRoleResourceRelationExample example);

    UserRoleResourceRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UserRoleResourceRelation row, @Param("example") UserRoleResourceRelationExample example);

    int updateByExample(@Param("row") UserRoleResourceRelation row, @Param("example") UserRoleResourceRelationExample example);

    int updateByPrimaryKeySelective(UserRoleResourceRelation row);

    int updateByPrimaryKey(UserRoleResourceRelation row);
}
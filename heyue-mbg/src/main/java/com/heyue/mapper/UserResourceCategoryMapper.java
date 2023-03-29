package com.heyue.mapper;

import com.heyue.model.UserResourceCategory;
import com.heyue.model.UserResourceCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserResourceCategoryMapper {
    long countByExample(UserResourceCategoryExample example);

    int deleteByExample(UserResourceCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserResourceCategory row);

    int insertSelective(UserResourceCategory row);

    List<UserResourceCategory> selectByExample(UserResourceCategoryExample example);

    UserResourceCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UserResourceCategory row, @Param("example") UserResourceCategoryExample example);

    int updateByExample(@Param("row") UserResourceCategory row, @Param("example") UserResourceCategoryExample example);

    int updateByPrimaryKeySelective(UserResourceCategory row);

    int updateByPrimaryKey(UserResourceCategory row);
}
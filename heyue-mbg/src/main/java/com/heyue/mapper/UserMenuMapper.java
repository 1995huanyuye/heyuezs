package com.heyue.mapper;

import com.heyue.model.UserMenu;
import com.heyue.model.UserMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMenuMapper {
    long countByExample(UserMenuExample example);

    int deleteByExample(UserMenuExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserMenu row);

    int insertSelective(UserMenu row);

    List<UserMenu> selectByExample(UserMenuExample example);

    UserMenu selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") UserMenu row, @Param("example") UserMenuExample example);

    int updateByExample(@Param("row") UserMenu row, @Param("example") UserMenuExample example);

    int updateByPrimaryKeySelective(UserMenu row);

    int updateByPrimaryKey(UserMenu row);
}
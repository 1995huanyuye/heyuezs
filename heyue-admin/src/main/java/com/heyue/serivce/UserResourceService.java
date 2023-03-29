package com.heyue.serivce;

import com.heyue.model.UserResource;

import java.util.List;

public interface UserResourceService {
    /**
     * 添加资源
     */
    int create(UserResource userResource);

    /**
     * 修改资源
     */
    int update(Long id, UserResource userResource);

    /**
     * 获取资源详情
     */
    UserResource getItem(Long id);

    /**
     * 删除资源
     */
    int delete(Long id);

    /**
     * 分页查询资源
     */
    List<UserResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum);

    /**
     * 查询全部资源
     */
    List<UserResource> listAll();
}

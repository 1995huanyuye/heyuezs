package com.heyue.dao;

import com.heyue.dto.ClientParam;
import org.apache.ibatis.annotations.Param;

/**
 * 后台客户管理自定义Dao
 */
public interface ClientDao {

    ClientParam queryClientInfo(@Param("client_id") Long client_id);
}

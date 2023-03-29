package com.heyue.config;

import com.heyue.model.UserResource;
import com.heyue.security.component.DynamicSecurityService;
import com.heyue.serivce.UserAdminService;
import com.heyue.serivce.UserResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *  heyue-security模块相关配置
 */
@Configuration
public class SecurityConfig {
    @Autowired
    private UserAdminService adminService;

    @Autowired
    private UserResourceService resourceService;

    @Bean
    public UserDetailsService userDetailsService() {
        //获取登录用户信息
        return usercode -> adminService.loadUserByUserCode(usercode);
    }

    @Bean
    public DynamicSecurityService dynamicSecurityService() {
        return new DynamicSecurityService() {
            @Override
            public Map<String, ConfigAttribute> loadDataSource() {
                Map<String, ConfigAttribute> map = new ConcurrentHashMap<>();
                List<UserResource> resourceList = resourceService.listAll();
                for (UserResource resource : resourceList) {
                    map.put(resource.getUrl(), new org.springframework.security.access.SecurityConfig(resource.getId() + ":" + resource.getName()));
                }
                return map;
            }
        };
    }
}

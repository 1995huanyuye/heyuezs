package com.heyue.security.config;

import com.heyue.config.BaseRedisConfig;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * Redis配置类
 */
@Configuration
@EnableCaching
public class RedisConfig extends BaseRedisConfig {
}

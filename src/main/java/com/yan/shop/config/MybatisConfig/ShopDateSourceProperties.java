package com.yan.shop.config.MybatisConfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author hairui
 * @date 2021/11/15
 * @des
 */
@Component
@EnableConfigurationProperties(DataSourceProperties.class)
@ConfigurationProperties(prefix = "spring.datasource.master")
public class ShopDateSourceProperties extends DruidDataSource {

}

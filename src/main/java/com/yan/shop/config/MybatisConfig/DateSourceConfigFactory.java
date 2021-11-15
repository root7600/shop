package com.yan.shop.config.MybatisConfig;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author hairui
 * @date 2021/11/15
 * @des 数据源配置
 */
@Configuration
@MapperScan(basePackages = DataSourcePackageConfig.PACKAGE, sqlSessionFactoryRef = "masterSqlSessionFactory")
public class DateSourceConfigFactory {

    @Autowired
    private ShopDateSourceProperties shopDateSourceProperties;

    @Bean(name = "masterDataSource")
    @Primary
    public DataSource masterDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(shopDateSourceProperties.getDriverClassName());
        dataSource.setUrl(shopDateSourceProperties.getUrl());
        dataSource.setUsername(shopDateSourceProperties.getUsername());
        dataSource.setPassword(shopDateSourceProperties.getPassword());
        return dataSource;
    }

    @Bean(name = "masterTransactionManager")
    @Primary
    public DataSourceTransactionManager masterTransactionManager() {
        return new DataSourceTransactionManager(masterDataSource());
    }

    @Bean(name = "masterSqlSessionFactory")
    @Primary
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("masterDataSource") DataSource masterDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(masterDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver() .getResources(DataSourcePackageConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }

}

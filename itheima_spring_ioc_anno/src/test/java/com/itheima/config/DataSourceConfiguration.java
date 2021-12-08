package com.itheima.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author wangguanru
 * @date 2021-11-17
 */
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    private String driver;

    @Bean("dataSource") //Spring会将当前方法的返回值以指定名称存储到Spring容器
    public DataSource getDataSource() throws Exception {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/book");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        return dataSource;

    }
}

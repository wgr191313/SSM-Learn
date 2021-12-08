package com.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

/**
 * @author wangguanru
 * @date 2021-11-25
 */
public class JdbcTemplateTest {

    @Test
    //测试Spring产生jdbcTemplate对象
    public void test2() throws PropertyVetoException{
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate=app.getBean(JdbcTemplate.class);
        int row= jdbcTemplate.update("insert into account values(?,?)","lisi",5000);
        System.out.println(row);
    }


    @Test
    //测试JdbcTemplate开发步骤
    public void test1() throws PropertyVetoException {
        //创建一个数据源对象
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        //设置数据源对象 知道数据库在哪
        jdbcTemplate.setDataSource(dataSource);
        //执行操作
        int row=jdbcTemplate.update("insert into account value(?,?)","tom",5000);
        System.out.println(row);
    }

}

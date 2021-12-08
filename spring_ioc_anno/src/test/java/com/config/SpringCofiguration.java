package com.config;

import org.springframework.context.annotation.*;

/**
 * @author wangguanru
 * @date 2021-11-17
 */

//标志该类是Spring的核心配置类
@Configuration
//<context:component-scan base-package="com.itheima"/>
@ComponentScan("com.itheima")
//<import resource=""/>
@Import({DataSourceConfiguration.class})
public class SpringCofiguration {


}

package com.itheima.web;

import com.itheima.config.SpringCofiguration;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangguanru
 * @date 2021-11-16
 */
public class UserController {

    public static void main(String[] args) {
        //ClassPathXmlApplicationContext app= new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app= new AnnotationConfigApplicationContext(SpringCofiguration.class);
        UserService userService=app.getBean(UserService.class);
        userService.save();
    }
}

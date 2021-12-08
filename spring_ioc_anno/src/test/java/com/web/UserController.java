package com.web;

import com.config.SpringCofiguration;
import com.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

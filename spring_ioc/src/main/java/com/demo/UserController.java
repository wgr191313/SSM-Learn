package com.demo;

import com.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangguanru
 * @date 2021-11-16
 */
public class UserController {

    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService =(UserService) app.getBean("userService");
        userService.save();
    }
}

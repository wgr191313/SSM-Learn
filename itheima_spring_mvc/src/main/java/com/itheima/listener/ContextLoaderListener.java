package com.itheima.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author wangguanru
 * @date 2021-11-17
 */
public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {


        ServletContext servletContext= sce.getServletContext();
        //读取web.xml中的全局参数
        String contextConfigLocation=servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext app= new ClassPathXmlApplicationContext(contextConfigLocation);
        //将Spring的应用上下文对象存储到ServletContext域中
        servletContext.setAttribute("app",app);
        System.out.println("Spring容器创建完毕....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

}

package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @author wangguanru
 * @date 2021-11-16
 */
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }

}

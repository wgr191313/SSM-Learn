package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

/**
 * @author wangguanru
 * @date 2021-11-16
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }

}

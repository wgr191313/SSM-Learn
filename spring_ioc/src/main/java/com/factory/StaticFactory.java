package com.factory;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;

/**
 * @author wangguanru
 * @date 2021-11-16
 */
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }

}

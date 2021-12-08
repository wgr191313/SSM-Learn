package com.factory;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;

/**
 * @author wangguanru
 * @date 2021-11-16
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }

}

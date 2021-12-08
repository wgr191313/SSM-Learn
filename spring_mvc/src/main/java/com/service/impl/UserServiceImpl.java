package com.service.impl;

import com.dao.UserDao;
import com.service.UserService;

/**
 * @author wangguanru
 * @date 2021-11-17
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }

}

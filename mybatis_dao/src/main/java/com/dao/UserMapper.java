package com.dao;

import com.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @author wangguanru
 * @date 2021-12-13
 */
public interface UserMapper {

    public List<User> findAll() throws IOException;

    public User findById(int id);
}

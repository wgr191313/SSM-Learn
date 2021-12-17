package com.mapper;

import com.domain.User;

import java.util.List;

/**
 * @author wangguanru
 * @date 2021-12-15
 */
public interface UserMapper {

    public void save(User user);
    public User findById(int id);
    public List<User> findAll();
}

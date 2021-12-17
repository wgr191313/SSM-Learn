package com.mapper;

import com.domain.User;

import java.util.List;

/**
 * @author wangguanru
 * @date 2021-12-16
 */
public interface UserMapper {

    public List<User> findAll();
    public List<User> findUserAndRoleAll();

}

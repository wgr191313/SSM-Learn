package com.mapper;

import com.domain.User;

import java.util.List;

/**
 * @author wangguanru
 * @date 2021-12-15
 */
public interface UserMapper {

    public List<User> findByCondition(User user);
    public List<User> findByIds(List<Integer> ids);

}

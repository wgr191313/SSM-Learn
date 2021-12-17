package com.mapper;

import com.domain.User;
import org.apache.ibatis.annotations.*;
import org.junit.Before;

import java.io.IOException;
import java.util.List;

/**
 * @author wangguanru
 * @date 2021-12-16
 */
public interface UserMapper {

    @Insert("insert into user value(#{id},#{username},#{password},#{birthday})")
    public void save(User user);
    @Update("update user set username=#{username},password=#{password} where id=#{id}")
    public void update(User user);
    @Delete("delete from user where id=#{id}")
    public void delete(int id);
    @Select("select * from user where id=#{id}")
    public User findById(int id);
    @Select("select * from user")
    public List<User> findAll();
    @Select("select * from user")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "username", property = "username"),
            @Result(column = "password", property = "password"),
            @Result(
                    property = "orderList",
                    column = "id",
                    javaType = List.class,
                    many = @Many(select = "com.mapper.OrderMapper.findByUid")
            )
    })
    public List<User> findUserAndOrderAll();


    @Select("select * from user")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(id = true,column = "username",property = "username"),
            @Result(id = true,column = "password",property = "password"),
            @Result(
                    property = "roleList",
                    column = "id",
                    javaType = List.class,
                    many=@Many(select = "com.mapper.RoleMapper.findByUid")
            )
    })
    public List<User> findUserAndRoleAll();

}

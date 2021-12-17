package com.mapper;

import com.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wangguanru
 * @date 2021-12-17
 */
public interface RoleMapper {

    @Select("select * from sys_user_role ur,sys_role r where ur.roleId=r.id AND ur.userId=#{uid}")
    public List<Role> findByUid();

}

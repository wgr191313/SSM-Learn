package com.mapper;

import com.domain.Account;

import java.util.List;

/**
 * @author wangguanru
 * @date 2021-12-17
 */
public interface AccountMapper {

    //保存账户数据
    void save(Account account);
    //查询账户数据
    List<Account> findAll();

}

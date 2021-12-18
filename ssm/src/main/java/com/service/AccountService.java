package com.service;

import com.domain.Account;

import java.util.List;

/**
 * @author wangguanru
 * @date 2021-12-17
 */
public interface AccountService {
    void save(Account account); //保存账户数据
    List<Account> findAll();//查询账户数据

}

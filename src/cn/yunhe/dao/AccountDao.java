package cn.yunhe.dao;

import cn.yunhe.enity.Account;

import java.util.List;

public interface AccountDao {
    List<Account> selectAll();

    List<Account> selectLimit(int ce, int ps);
}

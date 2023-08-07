package cn.yunhe.service.impl;

import cn.yunhe.dao.AccountDao;
import cn.yunhe.dao.impl.AccountDaoImpl;
import cn.yunhe.enity.Account;
import cn.yunhe.enity.PageUtils;
import cn.yunhe.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao = new AccountDaoImpl();
    @Override
    public PageUtils selectLimit(String currentPage, String pageSize) {
        int ce = Integer.valueOf(currentPage);
        int ps = Integer.valueOf(pageSize);
        List<Account> accountAll = accountDao.selectAll();
        int size = accountAll.size();
        List<Account> accounts = accountDao.selectLimit(ce,ps);
        PageUtils pageUtils = new PageUtils(ce, ps, size, accounts);
        return pageUtils;
    }
}

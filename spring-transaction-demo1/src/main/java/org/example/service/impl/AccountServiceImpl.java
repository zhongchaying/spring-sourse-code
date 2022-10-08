package org.example.service.impl;

import org.example.dao.AccountDao;
import org.example.service.AccountService;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out, String in, double money) {
        accountDao.transferOut(out, money);
        int a = 1 / 0;
        accountDao.transferIn(in, money);
    }
}

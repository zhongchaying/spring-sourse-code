package org.example.service.impl;

import org.example.dao.AccountDao;
import org.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service  //该注解转移到接口上报错
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    @Transactional  //TODO 该注解转移到接口上不会报错,建议把事务控制注解放到接口上
    public void transfer(String out, String in, double money) {
        accountDao.transferOut(out, money);
        int a = 1 / 0;
        accountDao.transferIn(in, money);
    }
}

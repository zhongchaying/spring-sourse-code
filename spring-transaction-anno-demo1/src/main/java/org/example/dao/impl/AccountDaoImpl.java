package org.example.dao.impl;

import org.example.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository  //该注解转移到接口上报错
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void transferOut(String out, double money) {
        int update = jdbcTemplate.update("update account set money=money-? where name=?", money, out);
        System.out.println(update==1?"转款人支出"+money:"ERROR");
    }

    @Override
    public void transferIn(String in, double money) {
        int update = jdbcTemplate.update("update account set money=money+? where name=?", money, in);
        System.out.println(update==1?"收款人收到"+money:"ERROR");
    }
}

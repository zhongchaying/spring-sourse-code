package org.example.dao.impl;

import org.example.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

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

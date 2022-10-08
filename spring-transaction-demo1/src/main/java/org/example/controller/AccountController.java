package org.example.controller;

import org.example.service.AccountService;
import org.example.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountController {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = context.getBean(AccountService.class);
        accountService.transfer("李四","张三",1000);
    }
}

package org.example.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    // @Transactional
    void transfer(String out,String in,double money);
}

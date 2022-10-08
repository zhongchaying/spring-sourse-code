package org.example.dao;

import org.springframework.stereotype.Repository;

public interface AccountDao {
    void transferOut(String out,double money);

    void transferIn(String in, double money);
}

package org.example.dao;

public interface AccountDao {
    void transferOut(String out,double money);

    void transferIn(String in, double money);
}

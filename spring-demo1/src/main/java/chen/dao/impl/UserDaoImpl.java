package chen.dao.impl;

import chen.dao.UserDao;
import chen.domain.User;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private List<String> list;

    private List<User> userList;

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public List<String> show() {
        System.out.println("UserDaoImpl is running...");
        return list;
    }

    @Override
    public List<User> showUser() {
        return userList;
    }
}

package chen.service.impl;

import chen.dao.UserDao;
import chen.domain.User;
import chen.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void show() {
        System.out.println("正在调用dao接口的方法!!!");
        List<String> show = userDao.show();
        System.out.println(show.size());
    }

    @Override
    public void showUser() {
        for (User user : userDao.showUser()) {
            System.out.println(user);
        }

    }
}

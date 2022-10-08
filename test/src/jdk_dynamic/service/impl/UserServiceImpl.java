package jdk_dynamic.service.impl;

import jdk_dynamic.model.User;
import jdk_dynamic.service.UserService;

/**
 * 目标对象
 */
public class UserServiceImpl implements UserService {
    @Override
    public void getUser(Integer age) {
        User user = new User("张三", age);
        System.out.println(user);
    }
}

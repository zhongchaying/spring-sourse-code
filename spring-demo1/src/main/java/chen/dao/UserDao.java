package chen.dao;

import chen.domain.User;

import java.util.List;

public interface UserDao {
    List<String> show();
    List<User> showUser();
}

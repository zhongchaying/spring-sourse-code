package config;

import chen.domain.User;
import org.springframework.context.annotation.Bean;

public class UserConfig {

    @Bean
    public User getUser(){
        User user = new User();
        user.setName("陈楚良");
        user.setAge(22);
        return user;
    }

}

package config;

import chen.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("demo")
//导入其他配置类文件
@Import(UserConfig.class)
public class SpringConfig {

    /*@Bean
    public User getUser(){
        User user = new User();
        user.setName("张三");
        user.setAge(24);
        return user;
    }*/

}

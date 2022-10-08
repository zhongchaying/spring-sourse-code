package chen.com.config;

import chen.com.vo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public Student stu1(){
        Student stu1 = new Student("张三", 21);
        return stu1;
    }

    @Bean(value = "stu")
    public Student stu2(){
        Student stu2 = new Student("李四", 25);
        return stu2;
    }
}

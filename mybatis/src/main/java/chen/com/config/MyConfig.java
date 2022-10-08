package chen.com.config;

import chen.com.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean(value = "student")
    public Student stu(){
        Student student = new Student();
        student.setAge(24);
        student.setId(1001);
        student.setName("李四");
        return student;
    }
}

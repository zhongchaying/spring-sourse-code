package chen.com;

import chen.com.config.MyConfiguration;
import chen.com.vo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Student stu1 = (Student) context.getBean("stu1");
        System.out.println(stu1);
        System.out.println("----------------------------------");
        Student stu = (Student) context.getBean("stu");
        System.out.println(stu);
    }
}

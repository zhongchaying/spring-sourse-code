import chen.dao.UserDao;
import chen.domain.User;
import chen.service.UserService;
import chen.service.impl.UserServiceImpl;
import config.SpringConfig;
import demo.Dao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.show();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserService userService = context.getBean(UserServiceImpl.class);
        // userService.show();
        userService.showUser();
    }

    @Test
    public void show(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:test.xml");
        Dao dao = context.getBean(Dao.class);
        dao.show();
    }

    @Test
    public void test4(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Dao bean = context.getBean(Dao.class);
        bean.show();
        User user = (User) context.getBean("getUser");
        System.out.println(user);
    }
}

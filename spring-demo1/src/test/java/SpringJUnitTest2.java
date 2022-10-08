import demo.Dao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//使用@Runwith注解替换原来的运行期
@RunWith(SpringJUnit4ClassRunner.class)
//使用@ContextConfiguration指定配置文件或配置类
@ContextConfiguration("classpath:test.xml")
public class SpringJUnitTest2 {

    @Value("李四")
    private String name;

    @Autowired
    private Dao dao;

    @Test
    public void testDao(){
        System.out.println(name);
        dao.show();
    }
}

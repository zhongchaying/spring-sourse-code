import chen.domain.User;
import config.SpringConfig;
import config.UserConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration可以使用UserConfig
// @ContextConfiguration(classes = UserConfig.class)
@ContextConfiguration(classes = SpringConfig.class)
public class SpringJUnitTest1 {
    @Autowired
    private User user;

    @Test
    public void test(){
        System.out.println(user);
    }
}

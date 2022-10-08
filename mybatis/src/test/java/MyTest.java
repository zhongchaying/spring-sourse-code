import chen.com.dao.StudentDao;
import chen.com.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyTest {
    @Test
    public void test1() throws IOException {

        //TODO 第一步: 读取mybatis-config.xml配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");

        //第二步: 构建SqlSessionFactory (框架初始化)
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        //第三步: 打开SqlSession
        SqlSession sqlSession = factory.openSession();

        //第四步: 获取Mapper接口对象 (底层是动态代理)
        StudentDao mapper = sqlSession.getMapper(StudentDao.class);

        //第五步: 调用Mapper接口对象的方法操作数据库
        Student student = mapper.selectById(2);

        //第六步: 适当进行业务的处理
        System.out.println(student);

        //第七步: [进行增删改必须]session提交并关闭 | 回滚
        // sqlSession.commit();
        // sqlSession.rollback();

        // 第八步: 关闭SqlSession资源 (这是必要的,防止数据库连接池满)
        sqlSession.close();

        /**
         * TODO SqlSession 接口对象是线程不安全的，所以每次数据库会话结束前，
         * 需要马上调用其 close()方法，将 其关闭。再次需要会话，再次创建。
         */
    }
}

package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.dao.UserDao;
import org.example.domain.Student;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {
    @Test
    public void test0(){
        InputStream resourceAsStream = MyTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Student> studentList = sqlSession.selectList("org.example.dao.UserDao.getAll");
        System.out.println(studentList);
        sqlSession.close();
    }

    @Test
    public void test() throws IOException {
        String path = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(path);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        for (Student student : mapper.getAll()) {
            System.out.println(student);
        }
        // MyBatis默认不是自动提交事务的，所以在insert, update, delete后要手动提交事务
        // sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test2() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Student student = new Student();
        student.setName("jackson");
        student.setAge(24);
        mapper.insert123(student);
        sqlSession.commit();//MyBatis默认不是自动提交事务的，所以在insert, update, delete后要手动提交事务
        sqlSession.close();
    }

    @Test
    //动态SQL语句,<where> <if>
    public void testSql() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Student student = new Student();
        student.setId(2);
        student.setName("李四");
        //查询id为2,姓名为李四的学生
        Student mapperById = mapper.getById(student);
        System.out.println(mapperById);
        sqlSession.close();
    }

    @Test
    //动态SQL语句,<where> <foreach>
    public void testSql2() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        //查询id为[2,4]的学生
        // int[] a = new int[]{2,4};
        // List<Student> mapperByIds = mapper.getByIds(a);
        List<Student> mapperByIds = mapper.getByIds(2, 4);
        System.out.println(mapperByIds);
        sqlSession.close();
    }
}

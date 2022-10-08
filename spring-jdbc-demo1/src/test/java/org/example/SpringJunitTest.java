package org.example;

import org.example.domain.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJunitTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void update(){
        List<Student> studentList = jdbcTemplate.query("select * from student", new BeanPropertyRowMapper<Student>(Student.class));
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

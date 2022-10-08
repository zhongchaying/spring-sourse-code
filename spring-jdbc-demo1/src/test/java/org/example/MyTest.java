package org.example;

import com.alibaba.druid.pool.DruidDataSource;
import com.mysql.jdbc.Driver;
import org.example.domain.Student;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MyTest {
    @Test
    public void text(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://81.68.251.67:3306/sbei?characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        //TODO 增删改 都是 jdbcTemplate.update
        int update = jdbcTemplate.update("insert into student(name,age) values(?,?)", "陈楚良", 22);
        System.out.println(update);
        // List<Student> studentList = jdbcTemplate.query("select * from student",
        //         new BeanPropertyRowMapper<Student>(Student.class));
        // for (Student student : studentList) {
        //     System.out.println(student);
        // }
    }
}

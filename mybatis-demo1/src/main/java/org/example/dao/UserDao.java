package org.example.dao;

import org.example.domain.Book;
import org.example.domain.Student;

import java.util.List;

public interface UserDao {
    List<Student> getAll();

    Student getById(Student student);

    // List<Student> getByIds(int[] ids);
    List<Student> getByIds(int... ids);

    Integer insert123(Student student);

    //---------------以下均为使用自定义TypeHandler获取数据库数据的----------
    void updateById(Student student);

    Student selectById(Student student);

    //---------------以下均为使用分页助手PageHelper获取数据库数据的----------
    List<Book> selectAll();
}
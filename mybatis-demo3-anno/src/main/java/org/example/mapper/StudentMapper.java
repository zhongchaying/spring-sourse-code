package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.domain.Student;

public interface StudentMapper {
    @Select("select id,name,age from student where id=#{id}")
    Student getById(Student student);
}

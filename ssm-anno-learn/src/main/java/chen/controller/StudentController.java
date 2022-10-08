package chen.controller;

import chen.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @RequestMapping("/students")
    @ResponseBody
    public Student getById(){
        Student student = new Student();
        student.setName("张三");
        student.setId(1016);
        student.setAge(24);
        student.setEmail("29749375972@163.com");
        return student;
    }
}








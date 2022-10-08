package org.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class UserController {

    @RequestMapping(value = "/query2")
    @ResponseBody
    public void get3(String username, MultipartFile uploadFile) throws IOException {
        System.out.println(username);
        System.out.println(uploadFile);
        String originalFilename = uploadFile.getOriginalFilename();
        uploadFile.transferTo(new File("F:\\"+originalFilename));
    }

    @ResponseBody
    @RequestMapping(value = "/query1" /*,produces = "application/json;charset=utf-8"*/)
    //期望SpringMVC自动将User对象转换成json格式的字符串
    //报错: [class org.example.domain.User] 没有预设 Content-Type 'null'] 的转换器
    public User get2(@RequestParam(value = "",required = false,defaultValue = "")String name) {
    // public User get2(@RequestParam(value = "",required = false,defaultValue = "")String name) {
        User user = new User();
        user.setName("李四");
        user.setAge(23);
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "/query",produces = "text/html;charset=utf-8")
    public String get() throws JsonProcessingException {
        System.out.println("学习Springmvc ...");

        User user = new User();
        user.setName("李四");
        user.setAge(23);

        //使用Jackson包把对象封装成JSON
        ObjectMapper mapper = new ObjectMapper();
        String str_json = mapper.writeValueAsString(user);
        System.out.println(str_json);
        // return "学习Springmvc ...";
        return str_json;
    }
}

package chen.controller;

import chen.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        User user = new User();
        user.setName("李四");
        user.setAge(23);
        return user;
    }

    @RequestMapping("/test1")
    @ResponseBody
    public String test1(){
        return "123";
    }
}

package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InterceptorController {
    @RequestMapping("/interceptor")
    public ModelAndView show(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "李四");
        modelAndView.setViewName("index.jsp");
        return modelAndView;
    }

}

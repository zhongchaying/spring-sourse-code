package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionResolverController {
    @RequestMapping("/exception")
    public ModelAndView exception(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","chenchuliang");
        String str = "abc";
        int a = Integer.parseInt(str);
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }

    @RequestMapping("/exception1")
    public ModelAndView exception1(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","chenchuliang");
        // String str = "abc";
        // int a = Integer.parseInt(str);
        int[] a = new int[3];
        int x= a[3];
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }
}

package org.example.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Controller中的方法 [目标方法] 被调用时,经过interceptor
 */
public class MyInterceptor implements HandlerInterceptor {
    @Override
    //在目标方法执行之前 执行
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle.....");
        //url: localhost:8080/interceptor?param=yes  ... 可以用作登录验证
        String param = request.getParameter("param");
        if("yes".equals(param)){
            return true;
        }else {
            request.getRequestDispatcher("/error.jsp").forward(request,response);
            return false;
        }
        //返回为真   放行
        // return true;
    }

    @Override
    //在目标方法执行之后,视图对象返回之前 执行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //这里可以操作目标方法中的对象 例如modelAndView
        // modelAndView.addObject("name","lisi-POST");
        System.out.println("postHandle.....");
    }

    @Override
    //在整个方法执行完毕后 执行
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion....");
    }
}

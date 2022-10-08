package org.example.aop.cglib;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 创建切面类
 */
public class MyAspect {
    public void before(){
        System.out.println("前置代码增强...");
    }
    public void afterReturning(){
        System.out.println("后置代码增强...");
    }
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知中的前置部分....");
        // point.getSignature().xxx();    point.getArgs();   ....
        System.out.println(point.getSignature());
        Object proceed = point.proceed();
        System.out.println("环绕通知中的后置部分....");
        return proceed;
    }
}

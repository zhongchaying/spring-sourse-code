package org.example.aop_anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.stereotype.Component;

/**
 * 创建切面类
 */
@Component("myAspect")
@Aspect //告诉当前类是一个切面类
public class MyAspect {
    /**切点表达式的抽取
     * 同xml配置aop一样,我们可以将切点表达式抽取。抽取方式是在切面内定义方法[方法体为空]，
     * 在该方法上使用@Pointcut注解定义切点表达式，然后在在增强注解中进行引用
     */
    @Pointcut("execution(* org.example.aop_anno.*.*(..))")
    public void myPoint(){}

    @Before("MyAspect.myPoint()")
    public void before(){
        System.out.println("前置代码增强...");
    }
    public void afterReturning(){
        System.out.println("后置代码增强...");
    }

    @Around("execution(* org.example.aop_anno.*.*(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕通知中的前置部分....");
        // point.getSignature().xxx();    point.getArgs();   ....
        System.out.println(point.getSignature());
        Object proceed = point.proceed();
        System.out.println("环绕通知中的后置部分....");
        return proceed;
    }
}

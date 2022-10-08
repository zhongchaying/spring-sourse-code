package org.example.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TargetProxy {
    public static void main(String[] args) {
        //创建目标对象
        Target target = new Target();
        //创建增强器
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Advice.before();
                Object invoke = method.invoke(target, args);
                Advice.afterReturning();
                return invoke;
            }
        });
        //创建代理对象
        Target proxy = (Target) enhancer.create();

        proxy.show();

    }
}

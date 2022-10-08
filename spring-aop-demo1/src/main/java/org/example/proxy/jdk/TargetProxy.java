package org.example.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TargetProxy {

    public static void main(String[] args) {
        TargetInterface targetInterface = new Target();
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(targetInterface.getClass().getClassLoader(),
                targetInterface.getClass().getInterfaces()
                , new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("前置代码增强....");
                        Object invoke = method.invoke(targetInterface, args);
                        System.out.println("后置代码增强....");
                        System.out.println(method);
                        System.out.println(args);
                        return invoke;
                    }
                });
        proxy.test2(12);
    }
}

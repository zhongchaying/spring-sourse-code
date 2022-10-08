package jdk_dynamic.test;

import jdk_dynamic.service.UserService;
import jdk_dynamic.service.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        //目标对象
        UserService userService = new UserServiceImpl();

        //代理对象
        UserService proxyInstance = (UserService) Proxy.newProxyInstance(
                // ClassLoader loader : 类加载器,完成目标对象的加载
                userService.getClass().getClassLoader(),

                // Class<?>[] interfaces : 目标对象实现的所有接口
                // userService.getClass().getInterfaces(),
                UserServiceImpl.class.getInterfaces(),
                // UserService.class.getInterfaces() 这个不行,会报错

                // InvocationHandler h : 实现代理功能的接口
                new InvocationHandler() {
                    @Override
                    public Object invoke(
                            //创建代理对象
                            Object proxy,
                            //目标方法
                            Method method,
                            //目标方法的参数
                            Object[] args) throws Throwable {
                        //代理功能 前置
                        System.out.println("前置");

                        //主业务功能实现
                        // userService.getUser(1);//还是写死了目标对象的方法调用,目标对象可能有多个方法
                        Object obj = method.invoke(userService, args);

                        //代理功能 后置
                        System.out.println("method.invoke方法由你外部激活");
                        return obj;//切记:这是目标方法的返回值
                    }
                });

        proxyInstance.getUser(1);//执行到此处时,进入到InvocationHandler的invoke方法中
    }
}

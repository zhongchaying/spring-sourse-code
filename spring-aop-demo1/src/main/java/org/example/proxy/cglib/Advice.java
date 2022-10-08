package org.example.proxy.cglib;

public class Advice {
    public static void before(){
        System.out.println("这是前置通知...");
    }

    public static void afterReturning(){
        System.out.println("这是后置通知...");
    }
}

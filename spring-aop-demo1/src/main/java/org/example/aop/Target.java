package org.example.aop;

/**
 * 创建目标类
 */
public class Target implements TargetInterface {
    @Override
    public void test() {
        System.out.println("调用接口的功能!!!");
    }

}

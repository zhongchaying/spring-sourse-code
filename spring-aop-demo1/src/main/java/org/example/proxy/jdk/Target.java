package org.example.proxy.jdk;

public class Target implements TargetInterface {
    @Override
    public void test() {
        System.out.println("调用接口的功能!!!");
    }

    @Override
    public String test2(int a) {
        System.out.println("abc" + a);
        return null;
    }

    public static void show() {
        if(new Target() instanceof TargetInterface){
            System.out.println("Target实现了TargetInterface");
        }
    }
}

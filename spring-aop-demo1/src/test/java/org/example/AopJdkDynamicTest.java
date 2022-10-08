package org.example;

import org.example.aop.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopJdkDynamicTest {
    @Autowired //这里必须使用 TargetInterfaceAnno 作为类型,因为spring检查到Target实现了接口,所以使用jdk动态创建代理对象
    private TargetInterface target;

    @Test
    public void test(){
        System.out.println(target);
        target.test();
    }
}

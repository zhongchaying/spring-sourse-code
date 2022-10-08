package org.example;

import org.example.aop.cglib.Target;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-cglib.xml")
public class AopCglibDynamicTest {
    @Autowired
    private Target target;

    @Test
    public void test(){
        System.out.println(target);
        target.test();
    }
}

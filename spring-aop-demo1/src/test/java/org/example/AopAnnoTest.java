package org.example;

import org.example.aop_anno.TargetInterfaceAnno;
import org.example.aop_anno.config.AopConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AopConfig.class)
public class AopAnnoTest {
    @Autowired //TODO @Autowired是根据类型进行自动装配的，如果需要按名称进行装配，则需要配合@Qualifier使用
    // @Qualifier("target")
    private TargetInterfaceAnno targetAnno;

    @Test
    public void test(){
        targetAnno.test();
    }
}

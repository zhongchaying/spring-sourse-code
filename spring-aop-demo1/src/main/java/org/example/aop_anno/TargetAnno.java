package org.example.aop_anno;

import org.springframework.stereotype.Component;

/**
 * 创建目标类
 */
@Component("target")
public class TargetAnno implements TargetInterfaceAnno {
    @Override
    public void test() {
        System.out.println("调用接口的功能!!!");
    }

}

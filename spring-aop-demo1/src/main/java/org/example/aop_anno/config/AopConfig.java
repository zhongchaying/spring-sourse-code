package org.example.aop_anno.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.example.aop_anno")
@EnableAspectJAutoProxy
public class AopConfig {
}

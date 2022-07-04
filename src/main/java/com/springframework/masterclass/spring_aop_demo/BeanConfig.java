package com.springframework.masterclass.spring_aop_demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.springframework.masterclass.spring_aop_demo")
@EnableAspectJAutoProxy
public class BeanConfig {

}

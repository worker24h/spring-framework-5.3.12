package com.worker.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect {

    @Before("execution(* com.worker.beans.*.*(..))")
    public void before() {
        System.out.println("before...");
    }

    @After("execution(* com.worker.beans.*.*(..))")
    public void after() {
        System.out.println("after...");
    }
}

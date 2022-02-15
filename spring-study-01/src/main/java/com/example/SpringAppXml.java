package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppXml {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println(applicationContext.getBean("order"));
    }
}

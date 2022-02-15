package com.worker.beans;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    public User() {
        System.out.println("hello user");
    }

    public void getName() {
        System.out.println("User name is xuxb");
    }
}

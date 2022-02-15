package com.example.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    public HelloController() {
        System.out.println("HelloController ....");
    }

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello process");
        return "test";
    }

    @RequestMapping("/success")
    public String success() {
        System.out.println("success process");
        return "success";
    }
}

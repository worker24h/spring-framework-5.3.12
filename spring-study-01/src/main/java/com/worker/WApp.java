package com.worker;

import com.worker.data.Orders;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WApp {
    public static void main(String[] args) {
        try {
            //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
            ApplicationContext context = new AnnotationConfigApplicationContext("com.worker");
            Orders orders = context.getBean(Orders.class);
            System.out.println(orders);
            orders.getOrders();
            //context.registerShutdownHook();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

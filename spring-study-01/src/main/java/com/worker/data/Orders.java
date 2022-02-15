package com.worker.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Orders {
    public Orders() {
        System.out.println("hello orders");
    }

    public void getOrders() {
        System.out.println("Orders is acquired");
    }
}


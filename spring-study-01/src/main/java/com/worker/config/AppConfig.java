package com.worker.config;

import com.worker.data.Orders;

//@Configuration
public class AppConfig {
//    @Bean
    public Orders createOrders() {
        return new Orders();
    }
}

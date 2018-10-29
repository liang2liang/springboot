package com.honeycomb.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
    public DemoConfig() {
        System.out.println("初始化");
    }

    @Bean
    public String hi() {
        return "hi";
    }
}

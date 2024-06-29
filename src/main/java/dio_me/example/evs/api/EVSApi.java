package com.example.evs.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.evs")
public class EVSApi {
    public static void main(String[] args) {
        SpringApplication.run(EVSApi.class, args);
    }
}
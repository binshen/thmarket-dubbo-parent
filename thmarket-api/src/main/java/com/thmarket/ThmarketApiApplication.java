package com.thmarket;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDubbo
@EnableHystrix
@SpringBootApplication
public class ThmarketApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThmarketApiApplication.class, args);
    }
}

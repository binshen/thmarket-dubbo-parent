package com.thmarket.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceApplication {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}

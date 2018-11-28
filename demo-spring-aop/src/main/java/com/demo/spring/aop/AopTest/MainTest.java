package com.demo.spring.aop.AopTest;

import com.demo.spring.aop.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.insertUser("wgw");
    }
}

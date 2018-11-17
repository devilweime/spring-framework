package com.demo.spring.ioc.test;

import com.demo.spring.ioc.service.PassportService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassportTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        PassportService passportService = (PassportService) context.getBean("passportService");

        passportService.login("wgw");


    }
}

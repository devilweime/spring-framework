package com.demo.spring.ioc.service.impl;

import com.demo.spring.ioc.service.PassportService;
import com.sun.org.apache.xpath.internal.operations.String;

public class PassportServiceImpl implements PassportService {
    @Override
    public void login(String name) {
        System.out.println(name+" login");
    }
}

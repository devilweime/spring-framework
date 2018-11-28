package com.demo.spring.aop.service.impl;


import com.demo.spring.aop.service.LogService;
import org.aspectj.lang.JoinPoint;


public class LogServiceImpl implements LogService{

    void before(JoinPoint joinpoint){
        System.out.println("调用之前操作");
    }

    void after(JoinPoint joinpoint){
        System.out.println("调用之后操作");
    }

    void afterReturn(JoinPoint joinpoint, Object obj){
        System.out.println(obj);
        System.out.println("返回结果之后操作");
    }

    void faterThrow(JoinPoint joinpoint){
        System.out.println("抛出异常之后操作");
    }


}

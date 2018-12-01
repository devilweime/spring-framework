package com.demo.spring.aop.AopTest;

import com.demo.spring.aop.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations={"classpath*:application.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AopTest {

    @Autowired
    private UserService userService;

    @Test
    public void insertTest(){
        userService.insertUser("wgw");
    }

}

package com.demo.spring.aop.service.impl;

import com.demo.spring.aop.entity.User;
import com.demo.spring.aop.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void insertUser(String name) {
        System.out.println("新增用户："+name);
    }

    @Override
    public void updateUser(String name) {
        System.out.println("修改用户："+name+"出错");
    }

    @Override
    public void deleteUser(String name) {
        System.out.println("删除用户："+name);
    }

    @Override
    public User queryUser(String name) {
        User user = new User();
        user.setName(name);
        user.setAge(18);
        System.out.println("查询用户："+name);
        return user;
    }
}

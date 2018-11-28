package com.demo.spring.aop.service;

import com.demo.spring.aop.entity.User;

public interface UserService {

    void insertUser(String name);

    void updateUser(String name);

    void deleteUser(String name);

    User queryUser(String name);

}

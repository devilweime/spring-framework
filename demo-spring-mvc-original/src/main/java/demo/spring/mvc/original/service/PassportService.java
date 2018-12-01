package demo.spring.mvc.original.service;

import demo.spring.mvc.original.dao.model.User;

public interface PassportService {

    User login(String name , String password);
}

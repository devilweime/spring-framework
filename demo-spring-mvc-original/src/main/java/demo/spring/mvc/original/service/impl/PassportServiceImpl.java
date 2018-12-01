package demo.spring.mvc.original.service.impl;

import demo.spring.mvc.original.dao.model.User;
import demo.spring.mvc.original.service.PassportService;
import org.springframework.stereotype.Service;

@Service
public class PassportServiceImpl implements PassportService {
    @Override
    public User login(String name, String password) {
        return new User( name, password);
    }
}

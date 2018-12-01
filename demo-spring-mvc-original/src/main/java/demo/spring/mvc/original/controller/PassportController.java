package demo.spring.mvc.original.controller;

import demo.spring.mvc.original.dao.model.User;
import demo.spring.mvc.original.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class PassportController {

    @Autowired
    private PassportService passportService;

    @RequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response, ModelAndView mav) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = passportService.login(username, password);
        response.getWriter().write(user.getUsername()+"登录成功");
    }


}

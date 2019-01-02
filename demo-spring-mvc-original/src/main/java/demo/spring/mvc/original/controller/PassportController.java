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


    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/login")
    public void login(HttpServletRequest request, HttpServletResponse response, ModelAndView mav) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = passportService.login(username, password);
        response.getWriter().write(user.getUsername() + "登录成功");
    }

    @RequestMapping("test")
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response, ModelAndView mav) {
        mav.setViewName("test");
        mav.getModel().put("demo", "demo");
        return mav;
    }

    @RequestMapping("velocity-simple")
    public ModelAndView velocitySimple(HttpServletRequest request, HttpServletResponse response, ModelAndView mav) {
        mav.setViewName("velocity-simple");
        mav.getModel().put("demo", "demo");
        return mav;
    }


}

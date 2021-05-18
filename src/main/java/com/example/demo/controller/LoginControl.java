package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class LoginControl {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView doLogin(User user) {
        // 返回的对象
        ModelAndView mav = new ModelAndView();
        // 调用service层进行登录业务逻辑处理
        List<User> lstUsers = userService.query4Login(user);
        // 判断是否登录成功
        if (lstUsers != null && lstUsers.size() > 0) {
            // 登录成功
            // 返回登录成功的视图名
            mav.setViewName("ajaxdemo");
            // 缓存登录成功的数据  类似于 request.setAttribute（）
            mav.addObject("loginedUser", lstUsers.get(0)); // ModelAndView的缓存级别？
        } else {
            // 登录失败，返回登录页面
            mav.setViewName("index");
        }
        // 返回视图
        return mav;
    }
}

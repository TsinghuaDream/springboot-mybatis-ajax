package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxDemoController {

    @ResponseBody // 表示该方法进行ajax响应，不在使用springmvc的默认的视图处理
    @RequestMapping("/doAjax")
    public String doAjax(String userName) {
        System.out.println("接收ajax的参数：" + userName);
        // 返回ajax内容
        return "ajax处理完成：" + userName;
    }
}

package com.yjxxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloViewController {
    @RequestMapping(value="/view02")
    public String view02(){
        return "redirect:view.jsp?uname=zhangsan&upwd=123456";
    }

}

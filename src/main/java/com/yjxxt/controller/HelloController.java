package com.yjxxt.controller;

import com.yjxxt.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.http.HttpRequest;
import java.util.Arrays;

@Controller
public class HelloController {

    @RequestMapping("hello")
    public String sayIdy(Model model){
        //存储数据
        model.addAttribute("msg","Hello springmvc");
        //返回逻辑视图   视图解析器加了个前缀和后缀就是：/list.jsp
        return "list";
    }
    @RequestMapping("data")
    public String sayIdy(String msg, Integer age, Model model, HttpServletRequest req){
        System.out.println(msg+"<<"+age);
        //存储数据
        model.addAttribute("msg",msg);
        model.addAttribute("age",age);
        //返回逻辑视图   视图解析器加了个前缀和后缀就是：/list.jsp
        return "list";
    }
    @RequestMapping("dataBean")
    public String sayIdy(User user,Model model){
        System.out.println(user+"<<"+user);
        //存储数据
        model.addAttribute("user",user);
        //返回逻辑视图   视图解析器加了个前缀和后缀就是：/list.jsp
        return "list";
    }
    @RequestMapping("array")
    public String sayArray( String [] hobby,Model model){
        System.out.println(Arrays.toString(hobby)+"<<");
        //存储数据
        model.addAttribute("hobby",hobby.toString());
        //返回逻辑视图   视图解析器加了个前缀和后缀就是：/list.jsp
        return "list";
    }

    @RequestMapping("userA")
    public String sayArray( User user,Model model){
        System.out.println(Arrays.toString(user.getHobby())+"<<");
        //存储数据
        model.addAttribute("hobby",user.getHobby().toString());
        //返回逻辑视图   视图解析器加了个前缀和后缀就是：/list.jsp
        return "list";
    }
    @RequestMapping("redirect01")
    public String sayArray(String msg, Model model, HttpSession session){

        //存储数据
        model.addAttribute("msg","requestScope.msg");
        model.addAttribute("msg","sessionScope.msg");
        //转发
        //“foward:list.jsp";
        //重定向，注意 有forward，redirect出现,则视图解析器不进行解析
        //redirect:list.jsp
        return "redirect:list.jsp";
    }
}

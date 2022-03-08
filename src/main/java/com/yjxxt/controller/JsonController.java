package com.yjxxt.controller;

import com.yjxxt.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JsonController {

    @RequestMapping("one")
    @ResponseBody
    public User sayOne(){
        User user=new User();
        user.setAge(20);
        user.setMsg("hello");
        //user--json;{'age':20,'msg':hello}
        return user;
    }

    @RequestMapping("list")
    @ResponseBody
    public List<User> sayList(){

        List<User> ulist=new ArrayList<User>();
        User user =new User();
        user.setAge(20);
        user.setMsg("hello");

        User user1=new User();
        user1.setAge(22);
        user1.setMsg("haha");

        ulist.add(user);
        ulist.add(user1);

        return ulist;
    }

    @RequestMapping("req")

    public void sayReq(@RequestBody() User user){

    }
}

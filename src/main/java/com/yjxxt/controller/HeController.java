package com.yjxxt.controller;

import com.yjxxt.bean.Phone;
import com.yjxxt.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Set;

@Controller

public class HeController {


    @RequestMapping("data01")
    public String sayIndex(String msg, Model model){
        System.out.println(msg);
        //存储
        model.addAttribute("msg",msg);
        //跳转页面
        return  "hello";
    }

    @RequestMapping("data02")
    public String sayData(HttpServletRequest req, HttpServletResponse reqs,String uname ,String pwd ,Model model){
        System.out.println(uname+"---->"+pwd);
        //存储
        model.addAttribute("uname",uname);
        //跳转页面
        return  "hello";
    }
    @RequestMapping("data03")
    public ModelAndView sayData03(@RequestParam(name="msg" ,defaultValue="默认值") String uname, String pwd, Model model){
      //实例化对象
        ModelAndView mav=new ModelAndView();
        //存储
        mav.addObject("msg",uname);
        //页面跳转/WEB-INF/jsp/hello.jsp
        //mav.setViewName("hello");
        //mav.setViewName("forward:WEB-INF/jsp/hello.jsp");
        mav.setViewName("forward:WEB-INF/jsp/hello.jsp");
        //返回目标对象
        return mav;
    }

    @RequestMapping("data04")
    public ModelAndView sayView(@RequestParam(defaultValue = "18",name = "userAge") int age, @RequestParam(defaultValue = "10.0",name = "usermoney") double money){
        //实例化对象
        ModelAndView mav=new ModelAndView();
        //存储
        mav.addObject("age",age);
        mav.addObject("money",money);
        //指定页面
        mav.setViewName("hello");
        //返回目标对象
        return mav;
    }
    @RequestMapping("data05")
    public String sayView(User user, Model model ){
        System.out.println(user.getPlist());
        //存储
      model.addAttribute("plist",user.getPlist());
        //返回目标对象
        return "data05";
    }
    @RequestMapping("data06")
    public String saySet(User user, Model model ){
        System.out.println(user+"-->"+user.getPhones().size());
        //存储
      model.addAttribute("user",user);
        //返回目标对象
        return "data05";
    }
    @RequestMapping("data07")
    public String sayMap(User user, Model model ){
        //获取map
        Map<String, Phone> map=user.getMap();
        Set<String> set= map.keySet();
        for (String key:set) {
            System.out.println(key+"--->"+map.get(key));
        }
        //遍历map
        model.addAttribute("map",map);
        //页面跳转
        return "data05";
    }
}

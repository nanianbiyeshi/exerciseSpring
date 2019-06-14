package com.start.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map,
                        HttpSession s){
        if(!StringUtils.isEmpty(username)&&"123".equals(password)){
            s.setAttribute("loginuser",username);
            return  "redirect:/main.html";
        }else{
            map.put("msg","用户名或密码错误");
            return "login";}

    }
}


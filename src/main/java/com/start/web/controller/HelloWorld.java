package com.start.web.controller;

import com.start.web.exception.UserNotExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HelloWorld {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/hello")
    public String  getHello(@RequestParam("user") String user ) throws UserPrincipalNotFoundException {
        if(user.equals("aaa"))
        {
            throw new UserNotExistException();
        }
        return "hello";
    }
    @RequestMapping("/success")
    public String  getSuccess(Map<String,Object> map){
        //map.put("hello","你好");
        map.put("hello","<h1>你好<h1>");
        map.put("users",Arrays.asList("zhang","lisi","wamhwu "));
        return "success";
    }
//    @RequestMapping({"/", "/index.html"})
//    public String getIndex(){
//        return "index";
//    }


    @ResponseBody
    @GetMapping("/query")
    public Map<String,Object> getList(){
        List<Map<String,Object>> list =jdbcTemplate.queryForList("select * from department");

        return list.get(0);
    }
}

package com.start.web.controller;

import com.start.web.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {
    //@ResponseBody
    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e,HttpServletRequest request)
    {
        Map<String,Object> map=new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","user not exist");
        map.put("message","用户出错了");

        request.setAttribute("ext",map);
        return "forward:/error";

    }
}

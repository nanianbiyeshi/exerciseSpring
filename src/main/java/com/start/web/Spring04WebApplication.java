package com.start.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;
@MapperScan(basePackages = "com.start.web.mapper")
@SpringBootApplication
public class Spring04WebApplication {


    public static void main(String[] args) {

        SpringApplication.run(Spring04WebApplication.class, args);
    }
   @Bean
    public ViewResolver myViewReolver(){
        return new MyViewResolver();

     }
    private static class MyViewResolver implements ViewResolver{
        public MyViewResolver() {
        }

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }

}

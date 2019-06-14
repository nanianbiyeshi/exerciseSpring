package com.start.web.config;

import com.start.web.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyServletConfig {
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean re = new ServletRegistrationBean(new MyServlet(),"/myServlet");
        return re;
    }
}

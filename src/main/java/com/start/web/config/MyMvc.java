package com.start.web.config;

import com.start.web.componet.LoginHandlerInterceptor;
import com.start.web.componet.MylocalResolve;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//@EnableWebMvc
@Configuration
public class MyMvc extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //super.addViewControllers(registry);
        registry.addViewController("/atguigu").setViewName("success");
    }
    @Bean
    public WebMvcConfigurerAdapter   WebMvcConfigurerAdapter(){
        WebMvcConfigurerAdapter ad=new WebMvcConfigurerAdapter(){

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //super.addInterceptors(registry);
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/index.html")
                        .excludePathPatterns("/hello/**")
                        .excludePathPatterns("/")
                        .excludePathPatterns("/user/login")
                        .excludePathPatterns("/asserts/**")
                        .excludePathPatterns("/webjars/**")
                         .excludePathPatterns("/error/**")
                        .excludePathPatterns("/query/**")
                        .excludePathPatterns("/dept/**")
                   .excludePathPatterns("/empts/**")
                .excludePathPatterns("/druid/*")
                ;
            }

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
//                super.addViewControllers(registry);
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

        };
        return  ad;
    }
    @Bean
    public LocaleResolver localeResolver(){
       return new MylocalResolve();

    }
}

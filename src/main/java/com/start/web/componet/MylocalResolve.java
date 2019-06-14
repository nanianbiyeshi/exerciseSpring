package com.start.web.componet;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 在连接上携带中文信息
 */

public class MylocalResolve implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String l= httpServletRequest.getParameter("l");
        Locale lo=Locale.getDefault();
        if(!StringUtils.isEmpty(l)){
           String[] split= l.split("_");
            lo=new Locale(split[0],split[1]);
        }
        return lo ;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}

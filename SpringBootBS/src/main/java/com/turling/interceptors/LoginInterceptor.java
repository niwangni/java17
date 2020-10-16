package com.turling.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
自定义拦截器
 */
//Alt+insert
//如果登录了便放行   true   false:拦截
public class LoginInterceptor implements HandlerInterceptor {

    //在controller 执行之前进行拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       //如何判断用户登录了，通过session来判断
        if(request.getSession().getAttribute("user")!=null){
           //登录了才 放行
            return true;

        }else{
           // response.sendRedirect("/");
            response.sendRedirect("/easyui");
            return false;
        }

    }
}

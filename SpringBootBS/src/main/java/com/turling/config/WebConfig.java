package com.turling.config;

import com.turling.interceptors.LoginInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;


@Configuration //配置类（以后所有bean 什么的都在这些）
//扫dao包
@MapperScan("com.turling.dao")
public class WebConfig  implements WebMvcConfigurer {
    //注册拦截器
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor()).
//                addPathPatterns("/*").excludePathPatterns("/","/login","/easyui","bootstrap/**","js/**");
//    }

    //配置视图
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/easyui").setViewName("easyui");
        registry.addViewController("/login2").setViewName("login2");
        registry.addViewController("/layout").setViewName("layout");
        registry.addViewController("/west").setViewName("west");
        registry.addViewController("/layout2").setViewName("layout2");
        registry.addViewController("/west2").setViewName("west2");



    }
}

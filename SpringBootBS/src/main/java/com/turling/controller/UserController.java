package com.turling.controller;

import com.turling.entity.User;
import com.turling.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Resource
    private UserService userService;


//     @GetMapping("/")
//     public String toLogin(){
//        return "login";
//     }
//
//        @GetMapping("/index")
//    public String index(){
//        return "index";
//    }
    @GetMapping("/login")
    @ResponseBody
    /**
     *  注意User对象的属性名，要与表单元素name值一致
     *  否则就获不到表单对象 （报错：java.lang.RuntimeException: Value for username cannot be null)
     */
    public String login(User user, HttpSession session){
        User u = userService.Userlogin(user);
        if(u!=null){
            session.setAttribute("user",u);
           // return "redirect:/index";s
            return "success";
        }else {
            //  return "redirect:/";
            return "error";
        }

    }

    @GetMapping("/login3")
    @ResponseBody
    /**
     *  注意User对象的属性名，要与表单元素name值一致
     *  否则就获不到表单对象 （报错：java.lang.RuntimeException: Value for username cannot be null)
     */
    public String login2(User user, HttpSession session){
        User u = userService.Userlogin(user);
        if(u!=null){
            session.setAttribute("user2",u);
            // return "redirect:/index";s
            return "success";
        }else {
            //  return "redirect:/";
            return "error";
        }

    }

}

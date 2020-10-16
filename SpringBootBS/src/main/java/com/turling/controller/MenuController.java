package com.turling.controller;

import com.turling.entity.Menu;
import com.turling.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MenuController {
    @Autowired
    private MenuService menuService;
    @GetMapping("/show")
    @ResponseBody
    public List<Menu> showMenu(){
    return menuService.findAll();
    }

    //多级
    @GetMapping("/show2")
    @ResponseBody
    public List<Menu> showMenu2(){
        return menuService.findAllMenu();
    }

}

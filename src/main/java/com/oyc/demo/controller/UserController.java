package com.oyc.demo.controller;

import com.oyc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:用户控制器
 * @Author ms
 * @Date 2022/07/20
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String user(Model model) {
        model.addAttribute("title", "欢迎来到用户界面");
        model.addAttribute("userList", userService.list());
        return "user";
    }
}
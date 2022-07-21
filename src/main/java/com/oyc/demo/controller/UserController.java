package com.oyc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:用户控制器
 * @Author ms
 * @Date 2020/12/1 11:26 下午
 */
@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping
    public String user(Model model) {
        model.addAttribute("title", "欢迎来到用户界面");
        return "user";
    }
}
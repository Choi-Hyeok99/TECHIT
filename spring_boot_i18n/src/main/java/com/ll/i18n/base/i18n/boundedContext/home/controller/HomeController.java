package com.ll.i18n.base.i18n.boundedContext.home.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String showMain(){
        return "main";
    }
}

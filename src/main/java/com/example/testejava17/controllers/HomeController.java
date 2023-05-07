package com.example.testejava17.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;


@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("nome", "fulvio");
        return "home/index";
    }


    
}

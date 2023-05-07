package com.example.testejava17.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.testejava17.repositorio.AdministradoresRepo;

import org.springframework.ui.Model;


@Controller
@SpringBootApplication
@EnableJpaRepositories("com.example.testejava17.repositorio")
public class AdministradoresController {

    @Autowired
    private AdministradoresRepo administradoresRepo;


    @GetMapping("/administradores")
    public String index(Model model) {
        List administradores = administradoresRepo.findAll();
        return "administradores/index";
    }


    
}

        
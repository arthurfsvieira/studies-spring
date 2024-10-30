package com.arthurfsvieira.studies_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-word")
public class HelloWordController {
    @GetMapping
    public String helloword(){
        return "Acessando a página do Spring pelo endereço: localhost:8080/hello-word";
    }
}

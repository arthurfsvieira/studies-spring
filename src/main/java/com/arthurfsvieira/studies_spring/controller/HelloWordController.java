package com.arthurfsvieira.studies_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-word")
public class HelloWordController {

    @GetMapping
    public String helloWord(){
        return "Acessando pelo endereço: localhost:3000/hello-word";
    }
}

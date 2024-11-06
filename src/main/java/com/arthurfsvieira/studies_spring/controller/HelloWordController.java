package com.arthurfsvieira.studies_spring.controller;

import com.arthurfsvieira.studies_spring.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-word")
public class HelloWordController {

    @Autowired
    private HelloWordService helloWordService;

    @GetMapping
    public String helloWord(){
        return helloWordService.helloWord("Arthur");
    }
}
//iniciar projeto daqui
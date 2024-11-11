package com.arthurfsvieira.studies_spring.controller;

import com.arthurfsvieira.studies_spring.domain.User;
import com.arthurfsvieira.studies_spring.service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-word")
public class HelloWordController {

    @Autowired
    private HelloWordService helloWordService;

    @GetMapping
    public String helloWord(){
        return helloWordService.helloWord("Arthur");
    }

    @PostMapping("/{id}")
    public String helloWordPost(@PathVariable("id") String id,@RequestParam(value = "filter", defaultValue = "nenhum") String filter , @RequestBody User body) {
        return "Hello World Post" + body.getName() + id;
    }
}

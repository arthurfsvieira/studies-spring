package com.arthurfsvieira.studies_spring.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWordService {
    public String helloWord(String name){
        return "Hello Video!" + name;
    }
}

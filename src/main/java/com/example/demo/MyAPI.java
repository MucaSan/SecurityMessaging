package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAPI {
    @GetMapping
    public String testWelcome(){
        return "Start of demonstration of API for Java Spring Boot";
    }
}

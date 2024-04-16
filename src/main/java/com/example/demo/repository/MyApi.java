package com.example.demo.repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApi {
    @GetMapping
    public String welcomeMessage(){
        return "Welcome to API Service";
    }
}

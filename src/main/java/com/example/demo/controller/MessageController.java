package com.example.demo.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MessageController {
    @GetMapping
    public String returnSomething(){
        return "WELCOME TO CRYPTOGRAPHY API!";
    }
}

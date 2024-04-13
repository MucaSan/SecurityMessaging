package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    Calculator calculator, calculator2;
    @Override
    public void run(String... args) throws Exception {
        calculator.setMessageOfObject("TEST");
        System.out.println(calculator.getMessageOfObject());
        System.out.println(calculator2.getMessageOfObject());
    }
}

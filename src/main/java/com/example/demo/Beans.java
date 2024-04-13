package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Calculator calculator(){
        System.out.println("NEW OBJECT CREATED");
        Calculator calc1 = new Calculator();
        calc1.setMessageOfObject("SINGLETON");
        return calc1;
    }
}

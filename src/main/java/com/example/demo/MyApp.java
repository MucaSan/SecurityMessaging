package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    Calculator calculator;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("The sum is: " + calculator.sum(1,2));
        System.out.println("The subtraction is: " + calculator.subtract(1,2));
        System.out.println("The multiplication is: " + calculator.multiply(1,2));
        System.out.println("The division is: " + calculator.divide(1,2));

    }
}

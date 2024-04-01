package com.example.demo;

import org.springframework.stereotype.Component;
@Component
public class Calculator {
    public float sum(float num1, float num2){
        return num1+num2;
    }
    public float subtract(float num1, float num2){
        return num1-num2;
    }
    public float divide(float num1, float num2){
        return num1/num2;
    }
    public float multiply(float num1, float num2){
        return num1*num2;
    }

}

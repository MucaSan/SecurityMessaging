package com.example.demo;

import org.springframework.stereotype.Component;
@Component
public class Calculator {
    private String messageOfObject;
    public String getMessageOfObject(){
        return this.messageOfObject;
    }
    public void setMessageOfObject(String text){
        this.messageOfObject = text;
    }
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

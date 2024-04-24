package com.example.demo.model;

import org.springframework.stereotype.Component;
@Component
public class Message {
    private String title;
    private String body;

    public Message(String title, String body){
        this.title = title;
        this.body = body;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    public String toString(){
        return ("TITLE: " + this.title + "\n" +
                "BODY: " + this.body + "\n"
                );
    }
}

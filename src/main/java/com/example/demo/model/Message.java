package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;
@Entity
@Table(name="tbMessages")
public class Message {
    @Id
    private Integer id;
    @Column(name="title")
    private String title;
    @Column(name="body")
    private String body;
    public Message(Integer id,String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

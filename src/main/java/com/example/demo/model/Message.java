package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Entity
@Table(name="tbMessages")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Message {
    @Id
    private Integer id;
    @Column(name="title")
    private String title;
    @Column(name="body")
    private String body;
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

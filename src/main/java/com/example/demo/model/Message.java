package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
@Entity
@Table(name="db_messages")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Message {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="idUser")
    private Integer idUser;
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
    public Integer getIdUser() {
        return idUser;
    }
    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
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

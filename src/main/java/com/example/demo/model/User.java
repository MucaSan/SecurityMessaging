package com.example.demo.model;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;
import java.sql.Date;
@Entity
@Table(name="tbUsers")
public class User {
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="timeCreated")
    private Date timeCreated;
    public User(Integer id, String username, String password, Date timeCreated){
        this.id = id;
        this.username = username;
        this.password = password;
        this.timeCreated = timeCreated;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }
}

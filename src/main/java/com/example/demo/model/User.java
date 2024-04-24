package com.example.demo.model;
import org.springframework.stereotype.Component;
import java.sql.Date;
@Component
public class User {
    private Integer id;
    private String username;
    private String password;
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

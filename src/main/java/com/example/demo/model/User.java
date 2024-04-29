package com.example.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import java.sql.Date;
@Entity
@Data
@Table(name="tbUsers")
@NoArgsConstructor
@AllArgsConstructor
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
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public Date getTimeCreated() {
        return timeCreated;
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

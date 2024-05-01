package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getUsers(){return userService.listUsers();}
    @PostMapping("/add")
    public User postUser(@RequestBody User user){
        System.out.println(user);
        return userService.addUser(user);
    }

}

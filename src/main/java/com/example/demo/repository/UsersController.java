package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersRepository repository;
    @GetMapping("/users")
    public List<User> getUsers(){
            return repository.listAll();
    }
}

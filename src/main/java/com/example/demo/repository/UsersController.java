package com.example.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UsersController {
    @Autowired
    private UsersRepository repository;
    @GetMapping()
    public List<User> getUsers(){
            return repository.listAll();
    }
    @DeleteMapping("/{username}")
    public void deleteUsers(@PathVariable("username") String username){
        System.out.println("DELETED user-> "+username +  "SUCESSFULLY!" );
    }
    @PostMapping
    public void postUser(@RequestBody User user){
        System.out.println("User has been created!");
    }
}

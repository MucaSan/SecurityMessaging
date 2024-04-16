package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersRepository {
    public List<User> listAll(){
        List<User> arrayList = new ArrayList<>();
        arrayList.add(new User("user1", "123"));
        arrayList.add(new User("user2", "1234"));
       return arrayList;
    }
    public User findByUsername(String username){
        return new User("user1", "123");
    }
}

package com.example.demo.service;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User addUser(User user){
        return userRepository.save(user);
    }
    public List<User> listUsers(){
        return userRepository.findAll();
    }
    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }
    public User updateUser(User user, Integer id){
        User updateUser = userRepository.findById(id).orElse(null);
        if (updateUser != null){
            updateUser.setUsername(user.getUsername());
            updateUser.setPassword(user.getPassword());
            updateUser.setTimeCreated(user.getTimeCreated());
            return updateUser;
        }
        return null;
    }

}

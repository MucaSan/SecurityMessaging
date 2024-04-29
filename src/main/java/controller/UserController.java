package controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@ComponentScan(basePackages = "com.example.demo")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public User postUser(@RequestBody User user){
        return userService.addUser(user);
    }
}

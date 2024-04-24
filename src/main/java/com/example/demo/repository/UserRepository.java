package com.example.demo.repository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.time.LocalDate;
import java.time.ZoneId;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
        public List<User> getAll(){
                List <User> userList = new ArrayList<>();
                LocalDate localDate = LocalDate.now();
                // create a while syntax, when the database is created, and just insert the data to the enlist, so we can retrieve it later on the API;
                userList.add(new User(1, "test", "test", (java.sql.Date) Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())));
                userList.add(new User(2, "test2", "test2", (java.sql.Date) Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())));
                userList.add(new User(1, "test3", "test3", (java.sql.Date) Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())));
                return userList;
        }
        public User getUserById(Integer id){
                // log that the API retrieved the user, by doing a system.out.println;
                LocalDate localDate = LocalDate.now();
                User user = new User(1, "test", "test", (java.sql.Date) Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                System.out.println("GET method, retrieving by the id: " + user.getId());
                return user;
        }
        public User getUserByUsername(String username){
                // log that the API retrieved the user, by doing a system.out.println;
                LocalDate localDate = LocalDate.now();
                User user = new User(1, "test", "test", (java.sql.Date) Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                System.out.println("GET method, retrieving the username: " + user.getUsername());
                return user;
        }
        public User createUser(Integer id , String username, String password, Date time){
                // log that the API created the user, improve this with a proper logger if given enough time;
                System.out.print(
                        "POST method, inserting the following user into database: \n" +
                                "User \n { " +
                                "id: " + id + "\n , " +
                                "username: " + username + "\n ," +
                                "password: " + password + "\n ," +
                                "timeCreated: " + time.toString() + "\n" +
                                "}"
                );
                return new User(id, username, password, time);
        }

}

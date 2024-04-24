package com.example.demo.repository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Repository
public class UserRepository {
        public User getUserById(Integer id){
                LocalDate localDate = LocalDate.now();
                return new User(1, "test", "test", (java.sql.Date) Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        }
}

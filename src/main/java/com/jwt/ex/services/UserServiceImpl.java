package com.jwt.ex.services;

import com.jwt.ex.model.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl {


    private List<Users> users = new ArrayList<>();

    public UserServiceImpl(){
        users.add(new Users(UUID.randomUUID().toString(), "Shubham", "shubham@gmail.com"));
        users.add(new Users(UUID.randomUUID().toString(), "Sachin", "sachin@gmail.com"));
        users.add(new Users(UUID.randomUUID().toString(), "Anand", "anand@gmail.com"));
        users.add(new Users(UUID.randomUUID().toString(), "Prasant", "prasant@gmail.com"));
        users.add(new Users(UUID.randomUUID().toString(), "Atul", "atul@gmail.com"));


    }


    
    public List<Users> getUsers() {
        return users;
    }
}

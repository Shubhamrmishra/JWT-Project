package com.jwt.ex.controllers;


import com.jwt.ex.model.Users;
import com.jwt.ex.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;


@RestController
@RequestMapping("/home")
public class MainController {

    @Autowired
    UserServiceImpl service;

    @GetMapping("/current-user")
    public String getCurrentUser(Principal principal) {
        return principal.getName();
    }



    @GetMapping("/users")
    public List<Users> getUsers() {
        System.out.println("getting users");
        return service.getUsers();
    }
}

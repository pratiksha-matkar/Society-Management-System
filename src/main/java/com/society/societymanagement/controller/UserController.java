package com.society.societymanagement.controller;

import com.society.societymanagement.entity.User;
import com.society.societymanagement.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;



    @PostMapping
    public User createUser(@RequestBody User user) {

        System.out.println("POST API HIT");

        return userService.saveUser(user);
    }


    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }


}
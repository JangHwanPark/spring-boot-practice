package com.example.springpractice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    @GetMapping
    public User user() {
        return new User(1, "홍길동", "서울시 강남구");
    }
}
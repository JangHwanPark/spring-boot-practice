package com.example.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPracticeApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringPracticeApplication.class, args);
    }
    @GetMapping("/")
    public String home(@RequestParam(value = "name", defaultValue = "기본값?") String name) {
        return String.format("이름!! %s!", name);
    }
    @GetMapping("name")
    public String name(@RequestParam(value = "name", defaultValue = "이름!!") String name) {
        return String.format("Name %s!", name);
    }
}
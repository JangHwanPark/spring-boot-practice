package com.example.springpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;


// REST API를 사용하기 위해 @RestController 어노테이션을 붙여준다.
@RestController
public class GettingController {
    private static final String template = "Hello, %s!";
    
    // 원자적 연산? long 타입의 변수를 제공함
    private final AtomicLong counter = new AtomicLong();


    // GetMapping 어노테인션은 Get 요청을 받을 수 있게 해준다.
    @GetMapping("/")
    public String home(@RequestParam(value = "name", defaultValue = "기본값?") String name) {
        return String.format("이름!! %s!", name);
    }

    @GetMapping("/name")
    public Getting name(@RequestParam(value = "name", defaultValue = "World!!") String name) {
        return new Getting(counter.incrementAndGet(), String.format(template, name));
    }
}
package com.example.springpractice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 어플리케이션 클래스 생성 시 @SpringBootApplication 어노테이션을 붙여준다.
@SpringBootApplication
public class SpringPracticeApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringPracticeApplication.class, args);
    }
}
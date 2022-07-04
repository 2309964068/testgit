package com.example.springbootdemo.config;

import com.example.springbootdemo.pojo.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class MyConfig {
    @Bean
    public User user() {
        return new User("zhangsan", 18);
    }
}

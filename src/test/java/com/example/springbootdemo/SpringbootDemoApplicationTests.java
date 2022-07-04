package com.example.springbootdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
class SpringbootDemoApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
        System.out.println(dataSource.getClass());
    }

}

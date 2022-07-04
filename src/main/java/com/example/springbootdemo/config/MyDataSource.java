package com.example.springbootdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class MyDataSource {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return null;
    }
}

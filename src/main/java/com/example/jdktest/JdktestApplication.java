package com.example.jdktest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.jdktest.*.mapper")
public class JdktestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdktestApplication.class, args);
    }

}

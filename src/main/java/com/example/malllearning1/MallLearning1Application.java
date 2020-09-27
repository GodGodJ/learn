package com.example.malllearning1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.malllearning1.mgb.mapper")
public class MallLearning1Application {

    public static void main(String[] args) {
        SpringApplication.run(MallLearning1Application.class, args);
    }

}

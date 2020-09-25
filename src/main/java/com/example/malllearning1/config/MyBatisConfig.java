package com.example.malllearning1.config;


import org.mybatis.spring.annotation.MapperScan;

import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.example.malllearning1.mgb.mapper")
public class MyBatisConfig {

}

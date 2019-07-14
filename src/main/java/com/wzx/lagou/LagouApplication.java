package com.wzx.lagou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzx.lagou.repository")
public class LagouApplication {

    public static void main(String[] args){
        SpringApplication.run(LagouApplication.class, args);
    }
}

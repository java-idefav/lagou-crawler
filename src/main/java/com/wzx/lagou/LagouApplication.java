package com.wzx.lagou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@EnableCaching
@SpringBootApplication
@MapperScan("com.wzx.lagou.repository")
public class LagouApplication {

    public static void main(String[] args){
        SpringApplication.run(LagouApplication.class, args);
    }
}

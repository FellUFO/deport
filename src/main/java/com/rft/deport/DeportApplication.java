package com.rft.deport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rft.deport.dao")
public class DeportApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeportApplication.class, args);
    }

}

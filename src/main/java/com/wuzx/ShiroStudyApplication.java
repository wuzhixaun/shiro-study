package com.wuzx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.wuzx.shiro.system.mapper"})
@SpringBootApplication
public class ShiroStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroStudyApplication.class, args);
    }

}

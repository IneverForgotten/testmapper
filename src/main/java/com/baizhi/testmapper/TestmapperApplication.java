package com.baizhi.testmapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.baizhi.testmapper.dao")
public class TestmapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestmapperApplication.class, args);
    }

}

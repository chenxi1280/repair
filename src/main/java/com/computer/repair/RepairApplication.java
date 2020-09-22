package com.computer.repair;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

@EnableTransactionManagement
@MapperScan("com.computer.repair.dao")
public class RepairApplication {

    public static void main(String[] args) {
        SpringApplication.run(RepairApplication.class, args);
    }

}

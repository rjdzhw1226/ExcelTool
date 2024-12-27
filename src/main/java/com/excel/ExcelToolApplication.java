package com.excel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.excel.mapper")
public class ExcelToolApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExcelToolApplication.class, args);
    }
}

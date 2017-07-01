package com.gabor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@SpringBootApplication
//@EnableTransactionManagement
@MapperScan("com.gabor.dao")
public class CartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartApplication.class, args);
	}
}

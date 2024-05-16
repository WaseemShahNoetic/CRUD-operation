package com.example.CRUDoperation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.example")
@SpringBootApplication
@EntityScan(basePackages = "com.example.CRUDoperation.entity")
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
		System.out.println("CRUD Application running.....!");
	}

}

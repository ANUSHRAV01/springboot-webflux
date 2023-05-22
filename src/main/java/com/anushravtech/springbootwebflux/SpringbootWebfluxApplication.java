package com.anushravtech.springbootwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebfluxApplication.class, args);
		System.out.println("this is working and is called reactive programming");
	}

}

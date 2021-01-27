package com.renato.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ManagerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerApiApplication.class, args);
	}

}

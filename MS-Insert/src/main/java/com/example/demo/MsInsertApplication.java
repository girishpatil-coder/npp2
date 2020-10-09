package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsInsertApplication {

	public static void main(String[] args) {
		System.out.println("MS Insert");
		SpringApplication.run(MsInsertApplication.class, args);
	}

}

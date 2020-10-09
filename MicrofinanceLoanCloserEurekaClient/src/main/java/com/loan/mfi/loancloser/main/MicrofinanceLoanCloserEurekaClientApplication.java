package com.loan.mfi.loancloser.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicrofinanceLoanCloserEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrofinanceLoanCloserEurekaClientApplication.class, args);
	    System.out.println("=============================== Eureka LaonCloser Client =======================");
	}

}

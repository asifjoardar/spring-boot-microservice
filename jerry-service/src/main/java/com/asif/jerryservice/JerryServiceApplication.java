package com.asif.jerryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class JerryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JerryServiceApplication.class, args);
	}

}

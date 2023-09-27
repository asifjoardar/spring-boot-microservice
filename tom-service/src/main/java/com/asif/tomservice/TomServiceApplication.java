package com.asif.tomservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TomServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TomServiceApplication.class, args);
	}

}

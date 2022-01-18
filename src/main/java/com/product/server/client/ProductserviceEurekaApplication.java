package com.product.server.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class ProductserviceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductserviceEurekaApplication.class, args);
	}

}

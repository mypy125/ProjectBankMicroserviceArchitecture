package com.javastart.depositservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class DepositServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepositServiceApplication.class, args);
	}

}

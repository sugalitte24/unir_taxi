package com.unir.esp.ing.soft.daw.unir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DriverUnirApplication {

	public static void main(String[] args) {
		SpringApplication.run(DriverUnirApplication.class, args);
	}

}

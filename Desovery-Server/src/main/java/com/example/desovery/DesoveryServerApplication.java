package com.example.desovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DesoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesoveryServerApplication.class, args);
	}

}

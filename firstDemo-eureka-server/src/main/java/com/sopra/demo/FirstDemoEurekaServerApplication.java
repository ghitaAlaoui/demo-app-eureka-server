package com.sopra.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FirstDemoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstDemoEurekaServerApplication.class, args);
	}

}


package com.patika.faturadiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FaturaDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FaturaDiscoveryApplication.class, args);
	}

}

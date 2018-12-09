package com.simsekonline.microservices.netflixeurokanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NetflixEurokaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurokaNamingServerApplication.class, args);
	}
}

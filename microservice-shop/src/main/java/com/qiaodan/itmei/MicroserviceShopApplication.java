package com.qiaodan.itmei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceShopApplication.class, args);
	}
}

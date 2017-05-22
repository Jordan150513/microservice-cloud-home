package com.qiaodan.itmei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConsumerFeignApplication.class, args);
	}
}

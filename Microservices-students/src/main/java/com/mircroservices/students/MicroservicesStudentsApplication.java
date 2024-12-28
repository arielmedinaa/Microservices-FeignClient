package com.mircroservices.students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicesStudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesStudentsApplication.class, args);
	}

}

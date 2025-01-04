package com.mircroservices.students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "persistence.entities")
@EnableJpaRepositories(basePackages = "persistence.repository")
@EnableDiscoveryClient
@SpringBootApplication
public class MicroservicesStudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesStudentsApplication.class, args);
	}

}

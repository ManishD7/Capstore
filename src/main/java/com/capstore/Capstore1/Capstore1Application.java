package com.capstore.Capstore1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages="com.capstore.*")
@EntityScan(basePackages="com.capstore.*")
@ComponentScan(basePackages="com.capstore.*")
@EnableAutoConfiguration
@SpringBootApplication
public class Capstore1Application {
	public static void main(String[] args) {
		SpringApplication.run(Capstore1Application.class, args);
	}

}

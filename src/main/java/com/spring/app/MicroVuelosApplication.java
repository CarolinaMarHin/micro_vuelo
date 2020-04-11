package com.spring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.spring.repository")
@EntityScan("com.spring.model")
@ComponentScan("com.spring")
public class MicroVuelosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroVuelosApplication.class, args);
	}

}

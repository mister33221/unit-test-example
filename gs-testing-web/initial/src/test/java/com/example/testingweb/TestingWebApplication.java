package com.example.testingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// SpringBootApplication is a convenience annotation that adds all of the following:
// @Configuration
// @EnableAutoConfiguration
// @ComponentScan
// @ImportResource("classpath:/spring/applicationContext.xml")

@SpringBootApplication
public class TestingWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingWebApplication.class, args);
	}

}

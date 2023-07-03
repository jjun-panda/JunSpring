package com.mycom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBootApplication {

	public static void main(String[] args) {
		//		SpringApplication.run(HelloBootApplication.class, args);
		SpringApplication application = new SpringApplication(HelloBootApplication.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

}

package com.comstudy;


import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
//		app.setWebApplicationType(WebApplicationType.NONE);
//		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}

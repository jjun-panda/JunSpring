package com.mycom.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix = "board.jdbc")
@Data
public class MyDataSourceProperties {
	private String driverClass;
	private String url;
	private String user;
	private String password;
	
}

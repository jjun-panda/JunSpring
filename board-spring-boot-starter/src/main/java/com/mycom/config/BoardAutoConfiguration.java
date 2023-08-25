package com.mycom.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mycom.dbcp.common.MyDataSource;

@Configuration
@EnableConfigurationProperties(MyDataSourceProperties.class)
public class BoardAutoConfiguration {
	
	@Bean
	public MyDataSource getMyDataSource() {
		MyDataSource ds = new MyDataSource();
		ds.setDriverClass(properties.getDriverClass());
		ds.setUrl("jdbc:tcp://locahost");
		ds.setUser("");
		ds.setPassword("");
	}
}

package com.mycom.dbcp.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MyDataSource {
	private String driverClass;
	private String url;
	private String user;
	private String password;
	
	// 디폴트 생성자 사용자가 직접 추가
	public MyDataSource() {
		System.out.println(">>> MyDataSource 생성");
	}
}

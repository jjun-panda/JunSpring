package com.mycom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Service;

import com.mycom.dbcp.common.MyDataSource;

@Service("boardService")
public class BoardService {
	@Autowired
	private MyDataSource ds;
	
	public BoardService() {
		System.out.println(">>> BoardService 생성");
		
//		ds = new MyDataSource();
//		ds.setDriverClass("org.h2.Driver");
//		ds.setUrl("jdbc:tcp://locahost");
//		ds.setUser("");
//		System.out.println(ds);
	}
	
	public void run(ApplicationArguments atgs) throws Exception {
		System.out.println("run() - " + ds.getUrl());
	}
}

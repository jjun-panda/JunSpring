package org.com.myweb.service;

import java.util.List;

import org.com.myweb.model.Saram;
import org.com.myweb.model.SaramDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaramService {
	@Autowired
	private SaramDao dao;
	
	public List<Saram> saramList() {
		return dao.selectAll();
	}
}

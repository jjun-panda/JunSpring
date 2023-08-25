package org.com.myweb.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SaramDao {
	private List<Saram> list = new ArrayList<Saram>();
	public SaramDao() {
		for(int i=0; i<10; i++) {
			list.add(new Saram(i, "김코딩"+i));
		}
	}
	public List<Saram> selectAll() {
		return list;
	}

}

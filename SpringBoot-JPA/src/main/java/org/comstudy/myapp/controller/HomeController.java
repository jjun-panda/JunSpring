package org.comstudy.myapp.controller;

import org.comstudy.myapp.entity.Board;
import org.comstudy.myapp.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	BoardService boardService;
	
	@GetMapping("/test")
	public String jpaTest() {
		Board board = new Board();
		//board.setSeq(1000L);
		board.setTitle("My JPA 제목");
		board.setWriter("김범준");
		board.setContent("My JPA 내용 ...");
		boardService.persist(board);
		
		return "test JPA";
	}
}
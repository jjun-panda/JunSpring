package org.com.demo;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.com.demo.entity.Board;

public class JPAClient {

   public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("BoardWeb");
      EntityManager em = emf.createEntityManager();
      EntityTransaction tx = em.getTransaction();
      tx.begin();
      try {
         Board board = new Board();
         board.setTitle("JPA 제목");
         board.setWriter("관리자");
         board.setContent("JPA 글 등록 테스트 내용");
         board.setCreateDate(new Date());
         board.setCnt(0L);
         em.persist(board);
         tx.commit();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         if(em != null) em.close();
         if(emf != null) emf.close();
      }
   }

}
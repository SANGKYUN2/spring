package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.AccountDAO;
import com.example.dao.BBSDAO;
import com.example.dao.MessageDAO;
import com.example.dao.ReplyDAO;
import com.example.dao.UserDAO;
import com.example.domain.MessageVO;
import com.example.domain.QueryVO;
import com.example.domain.ReplyVO;

@SpringBootTest
public class MysqlTest {
		@Autowired
		UserDAO dao;
		
		@Test
		public void read() {
			dao.read("red");
		}
		
		@Autowired
		BBSDAO bdao;
		
//		@Test
//		public void test() {
//			QueryVO vo = new QueryVO();
//			vo.setKey("title");
//			vo.setWord("목적");
//			vo.setPage(1);
//			vo.setSize(5);
//			bdao.list(vo);
//		}

//		@Test
//		public void test1() {
//			bdao.read(1);
//		}
//		
//
//		
		@Autowired
		ReplyDAO rdao;
//		
//		@Test
//		public void test() {
//				rdao.total(253);
//		}
		
		@Autowired
		MessageDAO mdao;
		
//		@Test
//		public void test() {
//			MessageVO vo = new MessageVO();
//			vo.setSender("sky");
//			vo.setReceiver("qwer");
//			vo.setMessage("짱구야 놀자");
//			mdao.insert(vo);
//		}
		
		@Autowired
		AccountDAO adao;
		
		@Test
		public void test() {
				//mdao.readSend(2);
				//mdao.listSend("sky");
				//mdao.listReceive("qwer");
				adao.read("sky");
				//adao.list();
		}
	
}

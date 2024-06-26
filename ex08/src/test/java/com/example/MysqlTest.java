package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.MysqlDAO;

import com.example.domain.QueryVO;

@SpringBootTest
public class MysqlTest {
	
	@Autowired
	MysqlDAO dao;
	

	
	@Test
	public void test() {
		QueryVO vo = new QueryVO();
		vo.setPage(1);
		vo.setSize(3);
//		dao.now();
//		sdao.list(vo);
//		sdao.total(vo);
//		sdao.getcode("92", "건축");

	}
}



	

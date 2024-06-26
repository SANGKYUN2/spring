package com.example.dao;

import java.util.List;

import com.example.domain.CouVO;
import com.example.domain.QueryVO;

public interface CouDAO {
		public List<CouVO> list(QueryVO vo);
		public String getlcode(String dept);
		public void insert(CouVO vo);
		public void delete(String lcode);
		public CouVO read (String lcode);
		public void update(CouVO vo);
		public int total();
		public void updatePersons(String lcode, int amount);
		
}

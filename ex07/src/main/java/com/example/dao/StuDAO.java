package com.example.dao;

import java.util.List;

import com.example.domain.QueryVO;
import com.example.domain.StuVO;

public interface StuDAO {
		public List<StuVO> list(QueryVO vo);
		public int total(QueryVO vo);
		public String getcode(String yy, String dept);
		public void insert(StuVO vo);
		public StuVO read (String scode);
		public void delete(String scode);
		public void update(StuVO vo);
		public void updatePhoto(StuVO vo);
}

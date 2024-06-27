package com.example.dao;

import com.example.domain.UsersVO;

public interface UsersDAO {
		public void insert(UsersVO vo);
		public UsersVO read(String uid);
}

package com.example.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.UsersVO;

@Repository
public class UsersDAOImpl implements UsersDAO {
	
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.UsersMapper";

	@Override
	public void insert(UsersVO vo) {
			session.insert(namespace + ".insert" , vo);
		
	}

	@Override
	public UsersVO read(String uid) {
		return session.selectOne(namespace + ".read", uid);
	}

}

package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.BBSVO;


@Repository
public class BBSDAOImpl implements BBSDAO {

	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.BBSMapper";
	
	@Override
	public List<HashMap<String, Object>> bbs_list(BBSVO vo) {
		return session.selectList(namespace + ".bbs_list", vo);
	}

	@Override
	public void bbs_insert(BBSVO vo) {
		session.insert(namespace + ".bbs_insert", vo);
		
	}

	@Override
	public BBSVO bbs_read(int bbs_key) {
		return session.selectOne(namespace + ".bbs_read", bbs_key);
	}

	@Override
	public void bbs_delete(int bbs_key) {
		session.delete(namespace + ".bbs_delete", bbs_key);
		
	}

	@Override
	public void bbs_update(BBSVO vo) {
		session.update(namespace + ".bbs_update", vo);
		
	}

	@Override
	public int bbs_total() {
		return session.selectOne(namespace + ".bbs_total");
	}

}

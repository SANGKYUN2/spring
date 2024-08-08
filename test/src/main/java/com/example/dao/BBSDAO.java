package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.BBSVO;

public interface BBSDAO {
	public List<HashMap<String, Object>> bbs_list(BBSVO vo);
	public void bbs_insert(BBSVO vo);
	public BBSVO bbs_read(int bbs_key);
	public void bbs_delete(int bbs_key);
	public void bbs_update(BBSVO vo);
	public int bbs_total();
}

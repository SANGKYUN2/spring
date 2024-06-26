package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.TradeVO;

public interface TradeDAO {
		public List<HashMap<String, Object>> list(String ano);
		public void insert(TradeVO vo);
}

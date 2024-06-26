package com.example.dao;

import java.util.List;

import com.example.domain.AccountVO;
import com.example.domain.TradeVO;

public interface AccountDAO {
		public List<AccountVO> list();
		public AccountVO read(String uid);
		public void update (TradeVO vo);
}

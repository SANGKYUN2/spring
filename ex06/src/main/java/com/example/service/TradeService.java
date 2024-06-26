package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.TradeDAO;
import com.example.domain.TradeVO;

public interface TradeService {
		public void insert(TradeVO vo);
		
}

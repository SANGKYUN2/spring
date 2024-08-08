package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.BBSDAO;
import com.example.domain.BBSVO;

@RestController
@RequestMapping("/bbs")
public class BBSController {
	
	@Autowired
	BBSDAO bdao;
	
	@GetMapping("/bbs_list.json")
	public List<HashMap<String, Object>> bbs_list(BBSVO vo) {
		return bdao.bbs_list(vo);
	}
	
	@PostMapping("/bbs_insert")
	public void bbs_insert(@RequestBody BBSVO vo) {
		bdao.bbs_insert(vo);
	}
	
	@GetMapping("/bbs_read/{bbs_key}")
	public BBSVO bbs_read(@PathVariable("bbs_key") int bbs_key) {
		return bdao.bbs_read(bbs_key);
	}
	
	@PostMapping("/bbs_delete/{bbs_key}")
	public void bbs_delete(@PathVariable("bbs_key") int bbs_key) {
		bdao.bbs_delete(bbs_key);
	}
	
	@PostMapping("/bbs_update")
	public void bbs_update(@RequestBody BBSVO vo) {
		bdao.bbs_update(vo);
	}
	
	@GetMapping("/bbs_total")
	public int bbs_total() {
		return bdao.bbs_total();
	}

}

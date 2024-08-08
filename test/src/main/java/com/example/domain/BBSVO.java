package com.example.domain;

import java.util.Date;

public class BBSVO {
	private int bbs_key;
	private String bbs_title;
	private String bbs_contents;
	private String bbs_writer;
	private Date bbs_regDate;
	
	public int getBbs_key() {
		return bbs_key;
	}
	public void setBbs_key(int bbs_key) {
		this.bbs_key = bbs_key;
	}
	public String getBbs_title() {
		return bbs_title;
	}
	public void setBbs_title(String bbs_title) {
		this.bbs_title = bbs_title;
	}
	public String getBbs_contents() {
		return bbs_contents;
	}
	public void setBbs_contents(String bbs_contents) {
		this.bbs_contents = bbs_contents;
	}
	public String getBbs_writer() {
		return bbs_writer;
	}
	public void setBbs_writer(String bbs_writer) {
		this.bbs_writer = bbs_writer;
	}
	public Date getBbs_regDate() {
		return bbs_regDate;
	}
	public void setBbs_regDate(Date bbs_regDate) {
		this.bbs_regDate = bbs_regDate;
	}
	
	@Override
	public String toString() {
		return "BBSVO [bbs_key=" + bbs_key + ", bbs_title=" + bbs_title + ", bbs_contents=" + bbs_contents
				+ ", bbs_writer=" + bbs_writer + ", bbs_regDate=" + bbs_regDate + "]";
	}
	
}

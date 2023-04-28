package com.ssafy.board.model.dto;

public class SearchCondition {
	private String key;
	private String word;
	private String orderBy;
	private String orderByDir; // JSP에서 만든 name과 이름을 동일시 해야 함
	
	public SearchCondition() {
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getOrderByDir() {
		return orderByDir;
	}
	public void setOrderByDir(String orderByDir) {
		this.orderByDir = orderByDir;
	}
	
}

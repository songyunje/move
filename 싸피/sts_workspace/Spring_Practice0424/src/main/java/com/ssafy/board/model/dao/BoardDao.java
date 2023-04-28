package com.ssafy.board.model.dao;

import java.util.List;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.dto.SearchCondition;

public interface BoardDao {
	
	// 전체 게시물 조회
	public List<Board> selectAll();
	
	// ID로 특정 게시물 조회
	public Board selectById(int id);
	
	// 게시글 등록
	public void insertBoard(Board board);
	
	// 게시글 삭제
	public void deleteBoard(int id);
	
	// 게시글 수정
	public void updateBoard(Board board);
	
	// 조회수 증가
	public void updateViewCnt(int id);
	
	// 게시글 검색
	public List<Board> search(SearchCondition condition);
}

package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;

// 사용자 친화적으로
public interface BoardService {
	// 게시글 전체 조회
	public List<Board> getBoardList();
	
	// 게시글 상세 조회
	public Board readBoard(int id);
	
	// 게시글 작성
	public void writeBoard(Board board);
	
	// 게시글 삭제
	public void removeBoard(int id);
	
	// 게시글 수정
	public void modifyBoard(Board board);
	
	//
}

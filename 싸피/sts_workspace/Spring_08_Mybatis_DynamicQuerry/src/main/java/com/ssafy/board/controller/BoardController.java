package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.dto.SearchCondition;
import com.ssafy.board.model.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/")
	public String showIndex() {
		// 보여줄게 없으므로 리스트로 바로 이동
		return "redirect:list";
	}
	
	@GetMapping("list")
	public String list(Model model) {
		List<Board> list = boardService.getBoardList();
		model.addAttribute("list",list);
		return "/board/list";
	}
	
	@GetMapping("writeform")
	public String wirteform() {
		return "/board/writeform";
	}
	
	@PostMapping("write")
	public String write(Board board) {
		boardService.writeBoard(board);
		// 게시글 상세 보기로 바로 가고 싶어
		return "redirect:detail?id="+board.getId();
	}
	
	@GetMapping("detail")
	public String detail(Model model, int id) {
		Board board = boardService.readBoard(id);
		model.addAttribute("board", board);
		return "/board/detail";
	}
	
	@GetMapping("delete")
	public String delete(int id) {
		boardService.removeBoard(id);
		return "redirect:list";			
	}
	
	@GetMapping("updateform")
	public String updateform(Model model, int id) {
		model.addAttribute("board",boardService.readBoard(id));
		return "/board/updateform";
	}
	
	@PostMapping("update")
	public String update(Board board) {
		boardService.modifyBoard(board);
		return "redirect:detail?id="+board.getId();
	}
	
	
	// 검색 기능 작성
	@GetMapping("search")
//	public String search(Model model, String key, String word, String ...) {
	public String search(Model model, SearchCondition condition) {
		model.addAttribute("list", boardService.search(condition));
		return "/board/list";
	}
	
}

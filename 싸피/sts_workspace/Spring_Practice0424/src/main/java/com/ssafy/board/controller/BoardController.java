package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		return "redirect:list";
	}
	
	@GetMapping("list")
	public String list(Model model) {
		List<Board> list = boardService.getBoardList();
		model.addAttribute("list",list);
		return "/board/list";
	}
	
	@GetMapping("write")
	public String writeform() {
		return "board/writeform";
	}
	
	@PostMapping("write")
	public String write(Board board) {
		boardService.writeBoard(board);
		return "redirect:detail?id="+board.getId();
	}
	
	@GetMapping("detail")
	public String detail(Model model, int id) {
		Board board = boardService.readBoard(id);
		model.addAttribute("board", board);
		return "board/detail";
	}
	
	@GetMapping("delete")
	public String delete(int id) {
		boardService.removeBoard(id);
		return "redirect:list";
	}
	
	@GetMapping("update")
	public String updateform(Model model, int id) {
		Board board = boardService.readBoard(id);
		model.addAttribute("board", board);
		return "board/updateform";
	}
	
	@PostMapping("update")
	public String update(Board board) {
		boardService.updateBoard(board);
		return "redirect:detail?id="+board.getId();
	}
	
	@GetMapping("search")
	public String search(Model model, SearchCondition condition) {
		List<Board> list = boardService.search(condition);
		model.addAttribute("list",list);
		return "board/list";
	}
}

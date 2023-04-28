package com.ssafy.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.dto.SearchCondition;
import com.ssafy.board.model.service.BoardService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/api")
@Api(tags="게시판 컨트롤러")
@CrossOrigin("*")
public class BoardRestController {
	
	@Autowired
	private BoardService boardService;
	
	// 1. 목록 조회
	@ApiOperation(value="게시글 조회", notes = "검색 조건도 추가 가능")
	@GetMapping("/board")
	public ResponseEntity<?> list(SearchCondition condition){
//		List<Board> list = boardService.getBoardList(); -> 단순 전체 조회
		List<Board> list = boardService.search(condition); // 조건 검색
		
		if(list == null || list.size() == 0 )
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Board>>(list,HttpStatus.OK);
	}
	
	// 2. 상세 보기
	@GetMapping("/board/{id}")
	public ResponseEntity<Board> detail(@PathVariable int id){
		Board board = boardService.readBoard(id);
		
		// board가 null 이면 처리를 해야 함
		return new ResponseEntity<Board>(board,HttpStatus.OK);
	}
	
	// 3. 게시글 등록
	@PostMapping("/board")
	public ResponseEntity<Board> write(Board board){
		boardService.writeBoard(board);
		
		// 혹여나 키가 중복되거나 하는 문제로 글이 새로 등록되지 않는다면?
		// DB에서 테이블을 변경하는 작업이라면 변경된 행의 개수가 반환됨
		// 만약 0이 반환된다면 등록이 되지 않은 것이므로 관련 정보 전송
		// 그게 아니라면 잘 등록된 것이므로 OK 전송	
		return new ResponseEntity<Board>(board, HttpStatus.CREATED);
	}
	
	// 4. 게시글 삭제
	@DeleteMapping("/board/{id}")
	public ResponseEntity<Void> delete(@PathVariable int id){
		boardService.removeBoard(id);
		// 이것도 실제로 반환 값이 1이상이어야 실제로 삭제 작업이 실행됨
		// 이상한 값을 넣어도 동작을 해버림. -> 그러니 쿼리문을 보내지 못하게 사전에 컷
		// 권한이 있어야 지울 수 있도록 처리해야 함
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	// 5. 게시글 수정
	@ApiIgnore
	@PutMapping("/board") //-> JSON 형태의 데이터로 요청을 보내보자
	public ResponseEntity<Void> update(@RequestBody Board board){
		boardService.modifyBoard(board);
		// 얘도 마찬가지
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}

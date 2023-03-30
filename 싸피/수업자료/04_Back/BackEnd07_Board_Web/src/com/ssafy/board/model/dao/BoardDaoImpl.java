package com.ssafy.board.model.dao;

import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.util.DBUtil;

//싱글턴으로 만들어보자
public class BoardDaoImpl implements BoardDao {

	// DBUtil 가져와야함.
	private final DBUtil util = DBUtil.getInstance();

	private static BoardDaoImpl instance = new BoardDaoImpl();

	private BoardDaoImpl() {
	}

	public static BoardDaoImpl getInstance() {
		return instance;
	}

	@Override
	public List<Board> selectAll() {
		String sql = "SELECT * FROM board";
		List<Board> list = new ArrayList<>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		// 2. 데이터베이스를 연결을 해야됨
		try {
			conn = util.getConnection();

			stmt = conn.createStatement();
			// 전체 값을 가져오는 SQL문 작성

			rs = stmt.executeQuery(sql);

			// DB에서 인덱스는 1부터시작이에요
			while (rs.next()) {
				Board board = new Board();
				board.setId(rs.getInt("id")); // rs.getInt(1); 같은말
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getString("reg_date"));
				board.setViewCnt(rs.getInt("view_cnt"));

				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 박태흠 정답~~ 스코프 이
			util.close(rs, stmt, conn);
		}
		return list;
	}

	@Override
	public Board selectOne(int id) throws SQLException {
		String sql = "SELECT * FROM board WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Board board = new Board();
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, id);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				board.setId(rs.getInt(1));
				board.setWriter(rs.getString(2));
				board.setTitle(rs.getString(3));
				board.setContent(rs.getString(4));
				board.setViewCnt(rs.getInt(5));
				board.setRegDate(rs.getString(6));
			}

		} finally {
			util.close(rs, pstmt, conn);
		}

		return board;
	}

	@Override
	public void insertBoard(Board board) throws SQLException {
		// 굉장히 불편하다.
//		String sql = "INSERT INTO board (title, writer, content) VALUES ('"+board.getTitle()+"','....";	
		String sql = "INSERT INTO board (title, writer, content) VALUES (?,?,?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		conn = util.getConnection();
		pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getWriter());
		pstmt.setString(3, board.getContent());

		pstmt.executeUpdate();

		util.close(pstmt, conn);
	}

	@Override
	public void deleteBoard(int id) throws SQLException {
		String sql = "DELETE FROM board WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, id);
			int result = pstmt.executeUpdate();
			System.out.println(result + "개의 데이터가 지워졌습니다.");
		} finally {
			util.close(pstmt, conn);
		}
	}

	@Override
	public void updateBoard(Board board) throws SQLException {
		String sql = "UDDATE board SET title=?, content=? WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			pstmt.setInt(3, board.getId());
			
			pstmt.executeUpdate();
		}finally {
			util.close(pstmt, conn);
		}
	}

	@Override
	public void updateViewCnt(int id) throws SQLException {
		String sql = "UPDATE board SET view_cnt = view_cnt+1 WHERE id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = util.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, id);

			pstmt.executeUpdate();
		} finally {
			util.close(pstmt, conn);
		}
	}

}

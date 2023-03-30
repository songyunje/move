package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDaoImpl;
import dto.Board;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BoardDaoImpl dao = BoardDaoImpl.getInstance();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// GET 요청에서는 딱히 안해도 되지만 POST에서는 바꿔줘야해
		if (request.getMethod().equals("POST")) {
			request.setCharacterEncoding("UTF-8");
		}

		// FrontController 패턴
		String act = request.getParameter("act");

		switch (act) {
		case "list":
			doList(request, response);
			break;
		case "writeform":
			doWriteForm(request, response);
			break;
		case "write":
			doWrite(request, response);
			break;
		case "updateform":
			doUpdateForm(request, response);
			break;
		case "update":
			doUpdate(request, response);
			break;
		case "delete":
			Delete(request, response);
			break;
		case "detail":
			doDetail(request, response);
			break;
		default:
			break;
		}
	}

	private void doUpdateForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		try {
			request.setAttribute("board", dao.selectOne(id));
			request.setAttribute("videoid", request.getParameter("videoid"));
			request.getRequestDispatcher("board/updateform.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void Delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			dao.deleteBoard(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("board?act=list&videoid=" + request.getParameter("videoid") + "");
	}

	private void doUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Board board = new Board(); // 껍데기 생성 (바구니)

		board.setId(Integer.parseInt(request.getParameter("id")));
		board.setTitle(request.getParameter("title"));
		board.setContent(request.getParameter("content"));
		board.setWriter(request.getParameter("writer"));

		try {
			dao.updateBoard(board);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		response.sendRedirect("board?act=list&videoid=" + request.getParameter("videoid") + "");
	}

	private void doDetail(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		try {
			dao.updateViewCnt(id);
			// dao.selectOne(id) 이거 만약에 봤더니 안에 데이터 없으면 디테일이 아니라 에러페이지라던지..
			// 그런 식의 접근은 하지마세요~ 라는 등의 경고페이지를 하나 만들어서 그곳으로 보내면 되겠다!
			request.setAttribute("videoid", request.getParameter("videoid"));
			request.setAttribute("board", dao.selectOne(id));
			request.getRequestDispatcher("board/detail.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void doWrite(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Board board = new Board(); // 껍데기 생성 (바구니)

		board.setTitle(request.getParameter("title"));
		board.setContent(request.getParameter("content"));
		board.setWriter(request.getParameter("writer"));
		board.setVideoId(request.getParameter("videoid"));
		try {
			dao.insertBoard(board);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 등록 했으면 1. 상세페이지로 가서 그 글의 내용을 보여주는 것
		// 2. 전체 글 목록으로 돌아가기

		// 전체 글 목록으로 갈거지롱

		// 아래의 코드들은 문제가 있다! 새로고침 하니까 자꾸 늘어나
//		request.getRequestDispatcher("/board/list.jsp").forward(request, response);
//		doList(request, response);
		// 파라미터 값도 가져가나..? list에 파라미터 id 필요한데
		response.sendRedirect("board?act=list&videoid=" + request.getParameter("videoid") + "");
	}

	private void doWriteForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("board/writeform.jsp").forward(request, response);

	}

	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		List<Board> list = dao.selectAll();
//		request.setAttribute("list", list);
		String id = request.getParameter("videoid");
		// list라고 하는 이름으로 전체 게시글을 Dao에서 가져와 집어넣었다. 그리고 list.jsp로 포워딩
		request.setAttribute("list", dao.selectAll(id));
		request.getRequestDispatcher("board/list.jsp").forward(request, response);
	}

}

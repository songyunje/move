package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDaoImpl;
import dao.VideoDaoImpl;
import dto.Board;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/video")
public class VideoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private VideoDaoImpl dao = VideoDaoImpl.getInstance();
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// GET 요청에서는 딱히 안해도 되지만 POST에서는 바꿔줘야해
		if(request.getMethod().equals("POST")) {
			request.setCharacterEncoding("UTF-8");
		}
		
		//FrontController 패턴
		String act = request.getParameter("act");
		
		switch(act) {
		case "list":
			doList(request, response);
			break;
		case "detail":
			doDetail(request, response);
			break;
		default:
			break;
		}
	}
    
	private void doDetail(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		try {
			// dao.selectOne(id) 이거 만약에 봤더니 안에 데이터 없으면 디테일이 아니라 에러페이지라던지..
			// 그런 식의 접근은 하지마세요~ 라는 등의 경고페이지를 하나 만들어서 그곳으로 보내면 되겠다!
			request.setAttribute("video", dao.selectOne(id));
			request.getRequestDispatcher("/video/videodetail.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	private void doList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		List<Board> list = dao.selectAll();
//		request.setAttribute("list", list);
		
		// list라고 하는 이름으로 전체 게시글을 Dao에서 가져와 집어넣었다. 그리고 list.jsp로 포워딩
		request.setAttribute("list" , dao.selectAll());
		request.getRequestDispatcher("/video/videolist.jsp").forward(request, response);
	}

}

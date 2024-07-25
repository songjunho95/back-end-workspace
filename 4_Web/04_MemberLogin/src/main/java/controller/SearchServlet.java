package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.MemberDAO;

import java.io.IOException;
import java.lang.reflect.Member;


@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected service doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		MemberDAO dao = new MemberDAO();
		
	try {	
		
		Member member = dao.search(id);
		
		if(member!=null) {
			// 성공하면 views/search_ok.jsp 해당 정보 출력
			// 바인딩 - request
			request.setAttribute("member", member);
			request.getRequestDispatcher("/views/search_ok.jsp").forward(request, response);
			
		} else {
			response.sendRedirect("/views/search_fail.jsp");
			
		}
			
		}
	}

	}


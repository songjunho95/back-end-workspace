package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.dao.MemberDAO;
import model.vo.Member;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/allMember")
public class AllMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDAO dao = new MemberDAO();
		try {
			List<Member> list = dao.all();
			
			request.setAttribute("list", list);
			request.getRequestDispatcher("/views/allMember.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

package com.kh.contorller;

import jakarta.servlet.ServletException;

import java.io.IOException;
import java.sql.SQLException;

import com.kh.model.dao.EmployeeDAO;

@WebServlet("/search")
public class SearchServlet<HttpServletRequest> extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected <HttpServletResponse> void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = request.getParameter("id");
		
		EmployeeDAO dao = new EmployeeDAO();
		
		try {
			Employee employee = dao.search(id);
			
			if(employee!=null) {
				
				request.getAttribute("employee");
				request.getRequestDispatcher("views/fail.jsp");
				
			}	else {
				response.sendRedirect("views/fail.jsp");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

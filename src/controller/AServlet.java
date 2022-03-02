package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Student;


/**
 * Servlet implementation class AServlet
 */
@WebServlet("/restricted/AServlet")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public AServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession session= ((HttpServletRequest)request).getSession(false);
		Student s = (Student) session.getAttribute("user");
		session.setAttribute("exam", s.getExams());
	   
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<h3>Bene sei autenticato</h3>");
		request.getRequestDispatcher("/ListExams.jsp").forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Exam;
import model.Student;

/**
 * Servlet implementation class RegisterExam
 */
@WebServlet("/restricted/RegisterExam")
public class RegisterExam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegisterExam() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Date d = null;
		try {
			d=new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("examDate"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Exam ex = new Exam(request.getParameter("courseName"), request.getParameter("teacherName"), d);
		HttpSession session = request.getSession();
		Student s = (Student) session.getAttribute("user");
		s.setExams(ex);
		
		request.getRequestDispatcher("/ListExams.jsp").forward(request, response);
		
	}

}

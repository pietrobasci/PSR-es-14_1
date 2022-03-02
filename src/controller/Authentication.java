package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import model.UserMgmt;

/**
 * Servlet implementation class Authentication
 */
@WebServlet("/Authentication")
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Authentication() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		UserMgmt um = (UserMgmt)getServletConfig().getServletContext().getAttribute("users");
		User u= um.findUser(request.getParameter("username"));

		String url = null;
		
		if((u != null) && (u.getPassword().equals(request.getParameter("pass")))){
			HttpSession session = request.getSession();
			session.setMaxInactiveInterval(120);
			session.setAttribute("user",u);
			url = "/Authenticated.jsp";
		}
		else
			url = "/NotAuthenticated.jsp";
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
		
	}

}

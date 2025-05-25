package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;


import Model.LoginModel;

import dao.LoginDao;
import helper.ConectionProvider;



@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");
	
		String e=request.getParameter("email");
		String p=request.getParameter("pass");
		
		LoginDao dao=new LoginDao(ConectionProvider.getConnection());
		LoginModel user=dao.getUser(e, p);
		
		if(user!=null)
		{
			pout.print("Login succesfully");
			HttpSession session=request.getSession(true);
			session.setAttribute("currentuser", user);
			
			 
		}
		else
		{
			pout.println("Username and password is incorrect");
			
		}
	}

}

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

import Model.User_RegisterModel;
import dao.User_RegisterDao;
import helper.ConectionProvider;

/**
 * Servlet implementation class User_LoginController
 */
@WebServlet("/User_LoginController")
public class User_LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
    public User_LoginController() {
        super();
       
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		
				
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String e=request.getParameter("email");
		String p=request.getParameter("pass");
		
		Connection con=ConectionProvider.getConnection();
		User_RegisterDao dao=new User_RegisterDao(con);
		User_RegisterModel user=dao.getUser(e, p);
		if(user!=null)
		{
			
			
			HttpSession session=request.getSession();
			
			session.setAttribute("currentuser", user);
			//RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
			response.sendRedirect("Home.jsp");
			//rd.include(request, response);
			//response.sendRedirect("Home.jsp");
			
		}
		else
		{
			out.print("Username and Password is not correct");
			RequestDispatcher rd=request.getRequestDispatcher("user_Register.jsp");
			rd.forward(request, response);
		}
		
		
		
	}

}

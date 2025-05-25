package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import Model.User_RegisterModel;
import dao.User_RegisterDao;

/**
 * Servlet implementation class User_RegisterController
 */
@WebServlet("/User_RegisterController")
public class User_RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public User_RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");
		String n=request.getParameter("name");
		String e=request.getParameter("email");
		String ph=request.getParameter("ph");
		String p=request.getParameter("pass"); 
		
		User_RegisterModel obj= new User_RegisterModel(n, p, ph, e);
		
		
		User_RegisterDao obj1=new User_RegisterDao();
		
		int result=obj1.User_insert(obj);
		
		if(result==1)
		{
			response.sendRedirect("./Home.jsp");
		}
		else
		{
			pout.print("try again");
		}
	}

}

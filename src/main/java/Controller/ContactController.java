package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import Model.ContactModel;
import dao.ContactDao;

/**
 * Servlet implementation class ContactController
 */
@WebServlet("/ContactController")
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ContactController() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String c_name,c_address,c_message;
		c_name=request.getParameter("name");
		c_address=request.getParameter("email");
		c_message=request.getParameter("message");
		//out.print("hello123"+c_name+c_address+c_message);
		
		ContactDao cd=new ContactDao();
		ContactModel obj=new ContactModel(c_name, c_address, c_message);
		int result=cd.contact_insert(obj);
		
		if(result==1)
		{
			response.sendRedirect("Home.jsp");
		}
	}

}

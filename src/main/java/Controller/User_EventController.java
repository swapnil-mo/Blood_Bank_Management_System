package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import Model.User_EventModel;
import dao.User_EventDao;

/**
 * Servlet implementation class User_EventController
 */
@WebServlet("/User_EventController")
public class User_EventController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public User_EventController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("user_Event.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");
		
		String vename,vedesc,veadd,vedate;

		vename=request.getParameter("name");
		vedesc=request.getParameter("desc");
		veadd=request.getParameter("add");
		vedate=request.getParameter("event_date");
		
		User_EventDao Ud=new User_EventDao();
		User_EventModel ue=new User_EventModel(vename, vedesc, veadd, vedate);
		int result=Ud.insert_u_event(ue);
		
		if(result==1)
		{
			response.sendRedirect("./Home.jsp");
		}
		
		
		
	
	}

}

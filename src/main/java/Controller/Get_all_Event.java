package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import Model.EventModel;
import Model.InventoryModel;
import dao.EventDao;
import dao.InventoryDao;

/**
 * Servlet implementation class Get_all_Event
 */
@WebServlet("/Get_all_Event")
public class Get_all_Event extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Get_all_Event() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 PrintWriter out = response.getWriter();
		  response.setContentType("text/html");
		  EventDao obj=new EventDao();
		  HttpSession session = request.getSession(true);
		  ArrayList<EventModel> allEvent=obj.get_all_event();
		  session.setAttribute("allEvent", allEvent);
		  response.sendRedirect("Event_Update.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");
		
		int veid,vaid;
		String vename,veloc,vedesc,vdate;
		String but=request.getParameter("but");
		
		if(but.equalsIgnoreCase("update"))
		{
			veid=Integer.parseInt(request.getParameter("E_id"));
			
			vename=request.getParameter("E_name");
			vedesc=request.getParameter("E_desc");
			veloc=request.getParameter("E_loc");
			vdate=request.getParameter("Edate");
			vaid=Integer.parseInt(request.getParameter("E_aid"));
			
			EventDao obj1=new EventDao();
		
			EventModel obj=new EventModel(vename, vedesc, veloc, vdate, veid, vaid);
			int result=obj1.update_event(obj);
			
	
				if(result==1)
				{
					pout.println("update sucessfully");
				}
		}
		else if(but.equalsIgnoreCase("delete"))
		{
			veid=Integer.parseInt(request.getParameter("E_id"));
			EventDao obj=new EventDao();
			
		
			int result=obj.delete_event(veid);
			
			if(result==1)
			{
				doGet(request, response);
			}
			
		}
		
		
		
		
		
	
	}

}

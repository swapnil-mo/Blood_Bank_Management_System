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
import Model.LoginModel;
import dao.EventDao;
import helper.ConectionProvider;

/**
 * Servlet implementation class EventController
 */
@WebServlet("/EventController")
public class EventController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EventController() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EventDao em=new EventDao();
		ArrayList<LoginModel> alladmins=new ArrayList<LoginModel>();
		HttpSession session=request.getSession(true);
		alladmins=em.all_event();
		session.setAttribute("alladmins", alladmins);
		
		response.sendRedirect("Event.jsp");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");
		
	    //int vaid=Integer.parseInt(request.getParameter("adid"));
		String vname=request.getParameter("Name");
		String vdesc=request.getParameter("desc");
		String vloc=request.getParameter("loc");
		String vdate=request.getParameter("edate");
		int veid=Integer.parseInt(request.getParameter("adid"));
		/*System.out.println(vname+vdesc+vloc+vdate);
		EventDao Ed=new EventDao();
		int veid=Ed.E_id();
		System.out.println("id="+veid);
		//int v=Integer.parseInt(request.getParameter("veid"));
		*/
		EventDao Ed=new EventDao();
		EventModel Em=new EventModel(vname, vdesc, vloc, vdate, veid);
		
		int result=Ed.Event_insert(Em);
		
		if(result==1)
		{
			pout.println("insert sucessfully");
		}
		
		
		//doGet(request, response);
	}

}

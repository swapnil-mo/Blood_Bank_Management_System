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

import Model.ActivityModel;
import Model.LoginModel;
import dao.ActivityDao;

/**
 * Servlet implementation class ActivityController
 */
@WebServlet("/ActivityController")
public class ActivityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ActivityController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		ActivityDao ad=new ActivityDao();
		ArrayList<LoginModel> alladmins=new ArrayList<LoginModel>();
		HttpSession session=request.getSession(true);
		alladmins=ad.all_activity();
		session.setAttribute("alladmins", alladmins);
		
		response.sendRedirect("Activity.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");
	
		
		String vname=request.getParameter("Name");
		String vper=request.getParameter("per");
		int va_id =Integer.parseInt(request.getParameter("adimin_id"));
		
		ActivityDao AD=new ActivityDao();
		ActivityModel am=new ActivityModel(vname, vper, va_id);
		
		int result=AD.activity_insert(am);
		
		if(result==1)
		{
			pout.print("insert sucessfully");
		}
		//doGet(request, response);
	}

}

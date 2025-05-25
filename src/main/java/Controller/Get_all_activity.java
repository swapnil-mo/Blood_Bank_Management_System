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
import dao.ActivityDao;

/**
 * Servlet implementation class Get_all_activity
 */
@WebServlet("/Get_all_activity")
public class Get_all_activity extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Get_all_activity() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");
		ActivityDao obj=new ActivityDao();
		HttpSession session=request.getSession(true);
		ArrayList<ActivityModel> allAct=obj.get_all_activity();
		session.setAttribute("allAct", allAct);
		response.sendRedirect("Activity_update.jsp");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pout = response.getWriter();
		response.setContentType("text/html");
		
		
		
		int vlid,vaid;
		String vname,vper;
		String but=request.getParameter("but");
		System.out.println("ok"+but);
		if(but.equalsIgnoreCase("Update"))
		{
			vlid=Integer.parseInt(request.getParameter("L_id"));
		
			System.out.println("hii");
			vname=request.getParameter("A_name");
			vper=request.getParameter("P_date");
			vaid=Integer.parseInt(request.getParameter("A_id"));
		
			ActivityDao obj=new ActivityDao();
			
			ActivityModel obj1=new ActivityModel(vname, vper, vlid,vaid);
			obj.update_activity(obj1);
			
			int result=obj.update_activity(obj1);
			
			if(result==1)
			{
				pout.print("update sucessfully");
			}
		}
		else if(but.equalsIgnoreCase("delete"))
		{
			vlid=Integer.parseInt(request.getParameter("L_id"));
			
			ActivityDao obj=new ActivityDao();
			
			
			int result = obj.delete_activity(vlid);
			if(result==1)
			{
				
				doGet(request, response);
			}
		}

		
	}

}

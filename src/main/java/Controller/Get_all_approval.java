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

import Model.ApprovalModel;
import dao.ApprovalDao;

/**
 * Servlet implementation class Get_all_approval
 */
@WebServlet("/Get_all_approval")
public class Get_all_approval extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Get_all_approval() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ApprovalDao approvedao=new ApprovalDao();
		HttpSession session1=request.getSession();
		ArrayList<ApprovalModel> allapprove=approvedao.get_all_approval();
		session1.setAttribute("allapprove", allapprove);
		//System.out.println("all approve"+allapprove);
		response.sendRedirect("approve_update.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");
		
		String vstatus,vapprove_date;
		int vrequest_id,vdonor_id,vadmin_id,vapprove_id;
		
		String but=request.getParameter("but");
		
		if(but.equalsIgnoreCase("update"))
		{
			vstatus=request.getParameter("approval_status");
			vapprove_date=request.getParameter("approval_date");
//			vrequest_id=Integer.parseInt(request.getParameter("request_id"));
//			vdonor_id=Integer.parseInt(request.getParameter("donor_id"));
//			vadmin_id=Integer.parseInt(request.getParameter("admin_id"));
//			
			vapprove_id=Integer.parseInt(request.getParameter("approval_id"));
			
			ApprovalDao ad=new ApprovalDao();
			ApprovalModel Am=new ApprovalModel(vstatus, vapprove_date, vapprove_id);
			System.out.println("model="+Am);
			int result=ad.approval_update(Am);
			
			if(result==1)
			{
				pout.print("update sucessully");
			}
			
		}
		else if(but.equalsIgnoreCase("Delete"))
		{
			vapprove_id=Integer.parseInt(request.getParameter("approval_id"));
			System.out.println("approve="+vapprove_id);
			ApprovalDao ad=new ApprovalDao();
		
			
			int res=ad.approval_delete(vapprove_id);
			if(res==1)
			{
				doGet(request, response);
			}

		}
		
	}

}

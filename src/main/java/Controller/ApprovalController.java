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

import com.mysql.cj.Session;

import Model.ApprovalModel;
import Model.DonorModel;
import Model.LoginModel;
import Model.RequestModel;
import dao.ApprovalDao;

/**
 * Servlet implementation class ApprovalController
 */
@WebServlet("/ApprovalController")
public class ApprovalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ApprovalController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ApprovalDao obj1=new ApprovalDao();
		ArrayList<RequestModel> allrequest=new ArrayList<RequestModel>();
		ArrayList<DonorModel> alldonor=new ArrayList<DonorModel>();
		ArrayList<LoginModel> alladmin=new ArrayList<LoginModel>();
		HttpSession session=request.getSession();
		alladmin=obj1.get_all_admin();
		allrequest=obj1.get_all_request();
		alldonor=obj1.get_all_donor();
		session.setAttribute("alladmin",alladmin);
		session.setAttribute("alldonor", alldonor);
		session.setAttribute("allrequest", allrequest);
		
		response.sendRedirect("approval.jsp");
	}

	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");
		
		String vstatus,vapproval_date;
		int vrq_id,vdonor_id,vadmin_id;
		
		vstatus=request.getParameter("txst");
		vapproval_date=request.getParameter("txdate");
		vdonor_id=Integer.parseInt(request.getParameter("txdi"));
		vadmin_id=Integer.parseInt(request.getParameter("txad"));
		vrq_id=Integer.parseInt(request.getParameter("txrq"));
		
		ApprovalDao Ad=new ApprovalDao();
		ApprovalModel Am=new ApprovalModel(vstatus, vapproval_date, vrq_id, vdonor_id, vadmin_id);
		//System.out.println("model="+Am);
		int result=Ad.Approval_insert(Am);
		
		if(result==1)
		{
			pout.print("insert sucessfully");
		}
		 
		
		
				
	}

}

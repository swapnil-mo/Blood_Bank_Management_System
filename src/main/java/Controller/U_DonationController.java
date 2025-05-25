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

import Model.DonorModel;
import Model.U_DonationModel;
import dao.DonorDao;
import dao.U_DonationDao;

/**
 * Servlet implementation class U_DonationController
 */
@WebServlet("/U_DonationController")
public class U_DonationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public U_DonationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int uid = Integer.parseInt(request.getParameter("user_id")) ;
		String donor_name=request.getParameter("donor_name");

		System.out.println("uid="+uid);
		HttpSession session = request.getSession(true);
		DonorDao obj = new DonorDao();
		DonorModel donor_details = obj.getDonor(uid);
		DonorModel donor_details1=obj.getDonar11(donor_name);
		session.setAttribute("donor_details", donor_details);
		session.setAttribute("donor_details1", donor_details1);
		
		if(donor_details == null)
		{
			response.sendRedirect("user_donors.jsp");
		}
		else
		{
			response.sendRedirect("user_donation.jsp");
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String vdonor_name=request.getParameter("donor_name");
		String vfirst_time=request.getParameter("but");
		String vbl_group=request.getParameter("txbn");
		String vdonation_date=request.getParameter("txdd");
		String vquantity=request.getParameter("qty");
		String vcontact_no=request.getParameter("txcn");
		int vdonor_id=Integer.parseInt(request.getParameter("donorid"));
		
		
		U_DonationDao obj1=new U_DonationDao();
		U_DonationModel obj=new U_DonationModel(vdonor_name, vfirst_time, vbl_group, vdonation_date, vquantity, vcontact_no, vdonor_id);
		int result=obj1.insert_Donation(obj);
		
		if(result==1)
		{
//			response.sendRedirect("./Home.jsp");
			out.println("insert sucessfully");
		}
		
		//doGet(request, response);
	}

}

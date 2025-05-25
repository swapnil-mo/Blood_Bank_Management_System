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
import Model.User_RegisterModel;
import dao.DonorDao;

/**
 * Servlet implementation class DonorController
 */
@WebServlet("/DonorController")
public class DonorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DonorController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		DonorDao dd=new DonorDao();
//		ArrayList<User_RegisterModel> alluser=new ArrayList<User_RegisterModel>();
//		HttpSession session=request.getSession(true);
//		
//		session.setAttribute("alluser", alluser);
		response.sendRedirect("user_donors.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");
		
		String vdonor_name=request.getParameter("donor_name");
		String vbl_group=request.getParameter("txbn");
		String vdob=request.getParameter("txdob");
		String vlod=request.getParameter("txlob");
		String vadd=request.getParameter("txadd");
	
		int vu_id=Integer.parseInt(request.getParameter("userid").trim());
		
		DonorDao DD=new DonorDao();
		
		DonorModel dm=new DonorModel(vdonor_name, vbl_group, vdob, vlod, vadd, vu_id);
		
		int result=DD.insert_donor(dm);
		
		if(result==1)
		{
			response.sendRedirect("./Home.jsp");
			//pout.print("insert sucessfully");
		}
		//doGet(request, response);
	}

}

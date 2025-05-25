package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import Model.RequestModel;
import dao.RequestDao;


@WebServlet("/RequestController")
public class RequestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RequestController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("user_Request.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");

		String vbl_group=request.getParameter("txbn");
		String vrequest_reason=request.getParameter("txrr");
		String vquantity=request.getParameter("qty");
		int vu_id=Integer.parseInt(request.getParameter("use_id"));
		
		
		RequestDao Rd=new RequestDao();
		RequestModel Rm=new RequestModel(vbl_group, vrequest_reason, vquantity, vu_id);
		
		int result=Rd.insert_request(Rm);
		
		if(result==1)
		{
			response.sendRedirect("./Home.jsp");
		}
		//doGet(request, response);
	}

}

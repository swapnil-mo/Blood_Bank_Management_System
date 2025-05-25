package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import Model.InventoryModel;
import dao.InventoryDao;
import helper.ConectionProvider;

/**
 * Servlet implementation class InventoryController
 */
@WebServlet("/InventoryController")
public class InventoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InventoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pout=response.getWriter();
		response.setContentType("text/html");
		
		String vbl_group=request.getParameter("txbn");
		int vqty=Integer.parseInt(request.getParameter("qty"));
		String vu_d=request.getParameter("txud");
		
		InventoryDao obj1=new InventoryDao();
		int vbl_id=obj1.bl_id();
		//String formated1=request.getParameter("date");

//		Date u_d=new Date();
//		SimpleDateFormat formater=new SimpleDateFormat("YYYY-MM-DD");
//		String formated=formater.format(u_d);
		
		InventoryModel im=new InventoryModel(vbl_group, vqty,vu_d);
		int result=obj1.inventory_Insert(im,ConectionProvider.getConnection());
		
		if(result==1)
		{
			response.sendRedirect("Get_all_inventory");
		}
		
		
		/* doGet(request, response); */
	}

}

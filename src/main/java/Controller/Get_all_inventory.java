package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


import Model.InventoryModel;

import dao.InventoryDao;
import helper.ConectionProvider;

@WebServlet("/Get_all_inventory")
public class Get_all_inventory extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public Get_all_inventory() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//	response.getWriter().append("Served at: ").append(request.getContextPath());

		  PrintWriter out = response.getWriter();
		  response.setContentType("text/html");
		  InventoryDao obj = new InventoryDao();
		  HttpSession session = request.getSession(true);
		  ArrayList<InventoryModel> allInventory = obj.get_All_Inventory();
		  session.setAttribute("allInventory", allInventory);
		  response.sendRedirect("inventory_update.jsp");
		  
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		int vbid,vqty;
		String vbgroup,vud;
		String but=request.getParameter("but");
		if(but.equalsIgnoreCase("Update"))
		{
			vbid=Integer.parseInt(request.getParameter("blood_id"));
			vqty=Integer.parseInt(request.getParameter("qty"));
			vbgroup=request.getParameter("blood_group");
			vud=request.getParameter("update_date");
			
			InventoryDao obj2=new InventoryDao();
			InventoryModel obj = new InventoryModel(vbgroup,vud, vqty, vbid);
			int result = obj2.update_inventory(obj);
			
			
			
			
			
			if(result==1)
			{
			out.println("update sucessfully");
			}
			
			
		}
		else if(but.equalsIgnoreCase("Delete"))
		{
			vbid=Integer.parseInt(request.getParameter("blood_id"));
			
			InventoryDao obj1=new InventoryDao();
			InventoryModel obj = new InventoryModel(null,null,0, vbid);
			int result =obj1.delete_inventory(obj);
			
			if(result==1)
			{
				response.sendRedirect("Get_all_inventory");
			}
		}
		
//		doGet(request, response);
		
	}

}

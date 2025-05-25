package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.InventoryModel;
import helper.ConectionProvider;

public class InventoryDao {
	private static Connection con=null;
	
	  public InventoryDao() 
	  { 
		  
	  }
	  public InventoryDao(Connection con) 
	  { 
		  
		  this.con=con;
	  
	  }
	  public int bl_id()
	  {
		  
		  int id=0;
		  
		 try {
			 con=ConectionProvider.getConnection();
		  PreparedStatement ps=null;
		  ps=con.prepareStatement("select blood_inventory_id from blood_inventory");
		  ResultSet rs=ps.executeQuery();
		  while(rs.next())
		  {
			  id=rs.getInt(1);
		  }
		  
		}
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
		 return id;
	  }
	
	public int inventory_Insert(InventoryModel im, Connection con)
	{
		
		PreparedStatement ps=null;
		
		int res=0;
		try {
			
			ps=con.prepareStatement("insert into blood_inventory values(?,?,?,?)");
			ps.setInt(1, im.getBl_id());
			ps.setString(2, im.getBl_group());
			ps.setInt(3, im.getQty());
			ps.setString(4, im.getU_d());
			res=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("exp="+e);
			e.printStackTrace();
		}
		
		return res;
	}
	
	public ArrayList<InventoryModel> get_All_Inventory()
	{
		ArrayList<InventoryModel> obj = new ArrayList<InventoryModel>();
		con = ConectionProvider.getConnection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			ps = con.prepareStatement("select * from blood_inventory");
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				int bid = rs.getInt(1);
				String bgroup = rs.getString(2);
				int qty = rs.getInt(3);
				String bdate = rs.getString(4);
				
				InventoryModel obj1 = new InventoryModel(bgroup, bdate, qty, bid);
				obj.add(obj1);
			}
			
		
			
		} catch (Exception e) {
			System.out.println("get_all_inventory_exp="+e);
		}
		
		return obj;
	}
	public int update_inventory(InventoryModel im)
	{
		 con=ConectionProvider.getConnection();
		PreparedStatement st=null;
		
		int res=0;
		try {
			
			st=con.prepareStatement("update blood_inventory set blood_group=?,quantity=?,update_at=? where blood_inventory_id=?");
			st.setInt(4, im.getBl_id());
			st.setString(1, im.getBl_group());
			st.setInt(2, im.getQty());
			st.setString(3, im.getU_d());
			
			res=st.executeUpdate();
	
			if(res==1)
			{
				System.out.println("Update Sucessfully");
			}
		} catch (Exception e) {
			System.out.println("exp="+e);
		}
		return res;
	}
	public int delete_inventory(InventoryModel im)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement st=null;
		
		int res=0;
		try {
			st=con.prepareStatement("delete from blood_inventory where blood_inventory_id=?");
			st.setInt(1, im.getBl_id());
			res=st.executeUpdate();
			
			
			
		
		} catch (Exception e) {
			System.out.println("exp="+e);
		}
		return res;
	}
}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Model.RequestModel;
import helper.ConectionProvider;

public class RequestDao {
	private static Connection con=null;
	
	public RequestDao()
	{
		
	}
	public RequestDao(Connection con)
	{
		this.con=con;
	}
	public int insert_request(RequestModel Rm)
	{
		PreparedStatement ps=null;
		int res=0;
		try {
			con=ConectionProvider.getConnection();
			ps=con.prepareStatement("insert into blood_request(u_id,blood_group,quantity,request_reason) values(?,?,?,?)");
			ps.setInt(1, Rm.getUser_id());
			ps.setString(2, Rm.getBl_group());
			ps.setString(3, Rm.getQuantity());
			ps.setString(4, Rm.getRequest_reason());
			
			res=ps.executeUpdate();
			
			
					
		} catch (Exception e) {
			System.out.println("this is insert method in dao="+e);
		}
		return res;
	}
}

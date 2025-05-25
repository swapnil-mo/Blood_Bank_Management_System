package dao;

import java.rmi.server.ExportException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.User_RegisterModel;
import helper.ConectionProvider;

public class User_RegisterDao {
	private static Connection con = null;
	public User_RegisterDao()
	{
		
	}
	public User_RegisterDao(Connection con)
	{
		this.con=con;
		
	}
//	public int us_id()
//	{
//		int id=0;
//
//		
//		try {
//			con=ConectionProvider.getConnection();
//			PreparedStatement st=null;
//			st=con.prepareStatement("select user_id from user orders");
//			ResultSet rs=st.executeQuery();
//			if(rs.last())
//			{
//				id=rs.getInt(101);
//				
//			}
//			
//			
//		} catch (Exception e) {
//			System.out.println("this is user id method in dao="+e);
//		}
//		return id;
//	}
	public int User_insert(User_RegisterModel UM)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement st=null;
		int res=0;
		
		try {
			st=con.prepareStatement("insert into user values (?,?,?,?,?)");
			st.setInt(1, UM.getUid());
			st.setString(2, UM.getName());
			st.setString(3, UM.getEmail());
			st.setString(4, UM.getPass());
			st.setString(5, UM.getPh());
			res=st.executeUpdate();
			System.out.println(res);
		
		} catch (Exception e) {
			System.out.println("this is User insert method in dao="+e);
		}
		return res;
	}
	public User_RegisterModel getUser(String vemail,String vpass)
	{
		User_RegisterModel user=new User_RegisterModel(vpass, vemail, null, null, 0);
		try {
			PreparedStatement ps=con.prepareStatement("select * from user where email=? and password=?");
			ps.setString(1,vemail);
			ps.setString(2, vpass);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				user.setUid(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPass(rs.getString(4));
				user.setPh(rs.getString(5));

			}
			else
			
				user=null;
			
			}
			catch(Exception e)
			{
				System.out.println("this getuser method in dao="+e);
			}
			return user;
		}
		
	}
	



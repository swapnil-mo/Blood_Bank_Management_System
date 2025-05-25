package dao;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.LoginModel;
import helper.ConectionProvider;



public class LoginDao {
	
	 private static Connection con=null;	
	public LoginDao(Connection con) {
		
		this.con=con;
	}

	public LoginModel getUser(String vemail,String vpass)
	{	
	
		LoginModel user=new LoginModel(vemail, vpass);

		try {
			PreparedStatement ps=con.prepareStatement("select * from admins where email=? and passwords=?");
//			ps.setString(1, user.getEmail());
//			ps.setString(2, user.getPass());
			
			ps.setString(1, vemail);
			ps.setString(2, vpass);

			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				user.setAdmin(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setPass(rs.getString(4));
				user.setPh(rs.getString(5));
				user.setCrat(rs.getString(6));
			}
			else
		
			user = null;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
		
	}
	

}

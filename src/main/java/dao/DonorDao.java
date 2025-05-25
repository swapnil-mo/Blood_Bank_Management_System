package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.DonorModel;
import Model.User_RegisterModel;
import helper.ConectionProvider;

public class DonorDao {
	private static Connection con=null;
	
	public DonorDao()
	{
		
	}
	public DonorDao(Connection con)
	{
		this.con=con;
	}
//	public int D_id()
//	{
//		int id=0;
//		try {
//			con=ConectionProvider.getConnection();
//			PreparedStatement st=null;
//			st=con.prepareStatement("select user_id from user order");
//			ResultSet rs=st.executeQuery();
//			if(rs.last())
//			{
//				rs.getInt(1);
//			}
//		} catch (Exception e) {
//			System.out.println("this D_id method in dao="+e);
//		}
//		return id;
//	}
//	public ArrayList<User_RegisterModel> all_user()
//	{
//		ArrayList<User_RegisterModel> obj=new ArrayList<User_RegisterModel>();
//		con=ConectionProvider.getConnection();
//		PreparedStatement st=null;
//		ResultSet rs=null;
//		
//		try {
//			st=con.prepareStatement("select * from user");
//			rs=st.executeQuery();
//			while(rs.next())
//			{
//				int id=rs.getInt(1);
//				String name=rs.getString(2);
//				String ename=rs.getString(3);
//				String pass=rs.getString(4);
//				String ph=rs.getString(5);
//				
//				User_RegisterModel obj1=new User_RegisterModel(ename, pass, pass, ph, id);
//				obj.add(obj1);
//			}
//		} catch (Exception e) {
//			System.out.println("this is all_user method in dao="+e);
//		}
//		return obj;
//	}
	
	public int insert_donor(DonorModel Dm)
	{
		PreparedStatement ps=null;
		int res=0;
		try {
			con=ConectionProvider.getConnection();
			ps=con.prepareStatement("insert into donors(donor_name,user_id,blood_group,date_of_birth,last_donation,address) values(?,?,?,?,?,?)");
			
			ps.setString(1, Dm.getDonor_name());
			ps.setInt(2, Dm.getUser_id());
			ps.setString(3, Dm.getBl_group());
			ps.setString(4, Dm.getDate_birth());
			ps.setString(5, Dm.getLast_date());
			ps.setString(6,Dm.getAddre());
			
			
			res=ps.executeUpdate();
		
		} catch (Exception e) {
			System.out.println("this insert_donor method in dao="+e);
		}
		return res;
	}
	
	
	public DonorModel getDonor(int uid)
	{
		PreparedStatement ps=null;
		ResultSet rs = null;
		DonorModel obj =null;
		try {
			con=ConectionProvider.getConnection();
			ps=con.prepareStatement("SELECT * FROM project.donors where user_id=?;");
			
			ps.setInt(1, uid);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				int did = rs.getInt(1);
				String donor_name=rs.getString(2);
				int user_id = rs.getInt(3);
				String bl_group = rs.getString(4);
				String date = rs.getString(5);
				String last = rs.getString(6);
				String address = rs.getString(7);
				
				obj = new DonorModel(donor_name, bl_group, date, last, address, did, user_id);
				
			}
		
		} catch (Exception e) {
			System.out.println("this insert_donor method in dao="+e);
		}
		return obj;
	}
	public DonorModel getDonar11(String donor_nav)
	{
		PreparedStatement ps=null;
		ResultSet rs=null;
		DonorModel obj1=null;
		
		try {
			con=ConectionProvider.getConnection();
			ps=con.prepareStatement("select * from donors where donor_name=?");
			ps.setString(1, donor_nav);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				int donor_id=rs.getInt(1);
				String d_name=rs.getString(2);
				int user_id=rs.getInt(3);
				String blood_group=rs.getString(4);
				String date_of_birth=rs.getString(5);
				String last_date=rs.getString(6);
				String address=rs.getString(7);
				
				obj1=new DonorModel(donor_nav, blood_group, date_of_birth, last_date, address, donor_id, user_id);
				
				
			}
			
		} catch (Exception e) {
			System.out.println("this is getDonor11 method in dao="+e);
		}
		return obj1;
		
	}
}

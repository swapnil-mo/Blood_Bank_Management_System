package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.ActivityModel;
import Model.LoginModel;
import helper.ConectionProvider;

public class ActivityDao {
	private static Connection con=null;
	
	public ActivityDao()
	{
		
	}
	public ActivityDao(Connection con,ActivityModel Am)
	{
		this.con=con;
	}
	public int L_id()
	{
		int id=0;
		try {
			con=ConectionProvider.getConnection();
			PreparedStatement ps=null;
			ps=con.prepareStatement("select admin_id from admins order");
			ResultSet rs=ps.executeQuery();
			if(rs.last())
			{
				id=rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println("this is L_id method in dao="+e);
		}
		
		return id;
	}
	public ArrayList<LoginModel> all_activity()
	{
		ArrayList<LoginModel> obj=new ArrayList<LoginModel>();
		con=ConectionProvider.getConnection();
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			st=con.prepareStatement("select * from admins");
			rs=st.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String pass=rs.getString(4);
				String ph=rs.getString(5);
				String cr=rs.getString(6);
				
				LoginModel obj1=new LoginModel(name, email, pass, ph, cr, id);
				obj.add(obj1);
			}
			
		} catch (Exception e) {
			System.out.println("all_admins method in dao="+e);
		}
		return obj;
		
	}
	public int activity_insert(ActivityModel Am)
	{
		PreparedStatement ps=null;
		int res=0;
		try {
			con=ConectionProvider.getConnection();
			ps=con.prepareStatement("insert into activity(activity_name,performed_date,admin_id) values(?,?,?)");
			
			ps.setString(1,Am.getActivity_name());
			ps.setString(2, Am.getPerformed_at());
			ps.setInt(3, Am.getAdmin_id());
			
			res=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("activity_insert method in dao="+e);
		}
		return res;
	}
	public ArrayList<ActivityModel> get_all_activity()
	{
		ArrayList<ActivityModel> am=new ArrayList<ActivityModel>();
		con=ConectionProvider.getConnection();
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			ps=con.prepareStatement("select * from activity");
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				int vlid=rs.getInt(1);
				String vname=rs.getString(2);
				String vper=rs.getString(3);
				int vaid=rs.getInt(4);
				
				ActivityModel ad=new ActivityModel(vname, vper, vlid, vaid);
				am.add(ad);
			}
		} catch (Exception e) {
			System.out.println("get_all_activity method in dao="+e);
		}
		
		return am;
		
	}
	public int update_activity(ActivityModel am)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement ps=null;
		
		int res=0;
		try {
			ps=con.prepareStatement("update activity set activity_name=?,performed_date=?,admin_id=? where log_id=? ");
			ps.setString(1, am.getActivity_name());
			ps.setString(2, am.getPerformed_at());
			ps.setInt(3, am.getAdmin_id());
			ps.setInt(4, am.getLog_id());
			res=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("update_activity method in dao="+e);
		}
		return res;
	}
	public int delete_activity(int vlid)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement ps=null;
		
		int result=0;
		try {
			ps=con.prepareStatement("delete from activity where log_id=?");
			ps.setInt(1,vlid);
			
			result=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("delete_activity method in dao="+e);
		}
		return result;
	}
	
	
}

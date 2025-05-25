package dao;

import java.awt.Event;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.EventModel;
import Model.LoginModel;
import helper.ConectionProvider;

public class EventDao {
	private static Connection con=null;
	
	public EventDao()
	{
		
	}
	public EventDao(EventModel Em,Connection con)
	{
		this.con=con;
	}
	public int E_id()
	{
		int id=0;
		try {
			con=ConectionProvider.getConnection();
			PreparedStatement st=null;
			st=con.prepareStatement("select admin_id from admins order");
			//ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY
			ResultSet rs=st.executeQuery();
			if(rs.last())
			{
				id=rs.getInt(1);
			}
			
		} catch (Exception e) {
			System.out.println("this is eventdao exp="+e);
		}
		return id;
	}
	
	public ArrayList<LoginModel> all_event()
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
				int id= rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String pass=rs.getString(4);
				String ph=rs.getString(5);
				String cr=rs.getString(6);
				
				LoginModel obj1 = new LoginModel(name, email, pass, ph, cr, id);
				obj.add(obj1);
			}
		} catch (Exception e) {
			System.out.println("get_admins_event_dao_method_exp="+e);
		}
		return obj;
		
		
	}
	public int Event_insert(EventModel Em)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement st=null;
		int res=0;
		try {
			
			st=con.prepareStatement("insert into admin_event(ename,edesc,location,e_date,admin_id) values(?,?,?,?,?)");
			//st.setInt(1, Em.getEvent_id());
			st.setString(1, Em.getE_name());
			st.setString(2, Em.getE_desc());
			st.setString(3, Em.getLoc());
			st.setString(4, Em.getE_date());
			st.setInt(5, Em.getAd_id());
			res=st.executeUpdate();
			
	       System.out.println(res);
	       
	       
		} catch (Exception e) {
			System.out.println("this is event insert method exp="+e);
		}
		
		return res;
	}
	public ArrayList<EventModel> get_all_event()
	{
		ArrayList<EventModel> obj=new ArrayList<EventModel>();
		con=ConectionProvider.getConnection();
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			ps=con.prepareStatement("select * from admin_event");
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				int eid=rs.getInt(1);
				String ename=rs.getString(2);
				String edesc=rs.getString(3);
				String eloc=rs.getString(4);
				String edate=rs.getString(5);
				int aid=rs.getInt(6);
				
				EventModel obj1=new EventModel(ename, edesc, eloc, edate, eid, aid);
				obj.add(obj1);
			}
			
		} catch (Exception e) {
			System.out.println("this is get_all_event method exp="+e);
		}
		
		return obj;
	}
	public int update_event(EventModel Em)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement ps=null;
		
		
		int res=0;
		try {
			ps=con.prepareStatement("update admin_event set Ename=?,Edesc=?,Location=?,E_date=?,admin_id=? where event_id=?");
			ps.setString(1, Em.getE_name());
			ps.setString(2, Em.getE_desc());
			ps.setString(3, Em.getLoc());
			ps.setString(4, Em.getE_date());
//			System.out.println("Em="+Em.getE_date());
			ps.setInt(5, Em.getAd_id());
			ps.setInt(6, Em.getEvent_id());
			
			res=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("this is update_event method in dao exp="+e);
		}
		return res;
	}
	public int delete_event(int veid)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement ps=null;
		
		int res=0;
		try {
			ps=con.prepareStatement("delete from admin_event where event_id=?");
			ps.setInt(1, veid);
			res=ps.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println("this is delete method in Dao exp="+e);
		}
		return res;
	}
	

}

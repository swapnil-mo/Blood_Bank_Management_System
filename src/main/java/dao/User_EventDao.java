package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Model.User_EventModel;
import helper.ConectionProvider;

public class User_EventDao {
	private static Connection con=null;
	
	public User_EventDao()
	{
		
	}
	public User_EventDao(Connection con)
	{
		this.con=con;
	}
	public int insert_u_event(User_EventModel Ue)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement st=null;
		int res=0;
		try {
			st=con.prepareStatement("insert into user_event(event_name,event_description,address,event_date)values(?,?,?,?)");
			st.setString(1, Ue.getEname());
			st.setString(2, Ue.getEdesc());
			st.setString(3, Ue.getEaddress());
			st.setString(4, Ue.getEdate());
			
			res=st.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println("this is insert_u_event method in Dao="+e);
		}
		return res;
	}
}

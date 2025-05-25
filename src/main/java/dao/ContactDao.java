package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Model.ContactModel;
import helper.ConectionProvider;

public class ContactDao {
	private static Connection con=null;
	public ContactDao()
	{
		
	}
	public ContactDao(Connection con)
	{
		this.con=con;
	}
	public int contact_insert(ContactModel cm)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement ps=null;
		int res=0;
		try {
			ps=con.prepareStatement("insert into contact(name,address,message)values(?,?,?)");
			ps.setString(1, cm.getContact_name());
			ps.setString(2, cm.getContact_address());
			ps.setString(3, cm.getContact_message());
			
			res=ps.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println("this is contact_insert method in dao="+e);
		}
		return res;
	}
}

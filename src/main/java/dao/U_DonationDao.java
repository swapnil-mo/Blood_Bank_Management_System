package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Model.U_DonationModel;
import helper.ConectionProvider;

public class U_DonationDao {
	private static Connection con=null;
	
	public U_DonationDao()
	{
		
	}
	public U_DonationDao(Connection con)
	{
		this.con=con;
	}
	
	public int insert_Donation(U_DonationModel Um)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement ps=null;
		int res=0;
		try {
			ps=con.prepareStatement("insert into donation(donor_id,donor_name,first_time,blood_group,quantity,donation_date,contact_no) values(?,?,?,?,?,?,?)");
			ps.setInt(1,Um.getDonor_id() );
			ps.setString(2,Um.getDonor_name() );
			ps.setString(3, Um.getFirst_time());
			ps.setString(4,Um.getBlood_group());
			ps.setString(5, Um.getQuantity());
			ps.setString(6, Um.getDonation_date());
			ps.setString(7,Um.getContact_no());
			
			res=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("this is insert_Donation method in dao="+e);
		}
		return res;
	}
}

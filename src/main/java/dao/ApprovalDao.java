package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.ApprovalModel;
import Model.DonorModel;
import Model.LoginModel;
import Model.RequestModel;
import helper.ConectionProvider;

public class ApprovalDao {
	public static Connection con=null;
	
	public ApprovalDao()
	{
		
	}
	public ApprovalDao(Connection con)
	{
		
	}
	public ArrayList<RequestModel> get_all_request()
	{
		ArrayList<RequestModel> obj=new ArrayList<RequestModel>();
		con=ConectionProvider.getConnection();
		PreparedStatement st=null;
		ResultSet rs=null;
		
		try {
			st=con.prepareStatement("select * from blood_request");
			rs=st.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt(1);
				int uid=rs.getInt(2);
				String blgroup=rs.getString(3);
				String qty=rs.getString(4);
				String rqrea=rs.getString(5);
				
				RequestModel obj1=new RequestModel(blgroup, rqrea, qty, id, uid);
				obj.add(obj1);
				
				
			}
		} catch (Exception e) {
			System.out.println("this is get_all_request method in dao="+e);
		}
		return obj;
	}
	public ArrayList<DonorModel> get_all_donor()
	{
		ArrayList<DonorModel> donorobj=new ArrayList<DonorModel>();
		con=ConectionProvider.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			ps=con.prepareStatement("select * from donors");
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String donor_name=rs.getString(2);
				int uid=rs.getInt(3);
				String blgroup=rs.getString(4);
				String dob=rs.getString(5);
				String lod=rs.getString(6);
				String add=rs.getString(7);
				
				DonorModel obj=new DonorModel(donor_name, blgroup, dob, lod, add, id, uid);
				donorobj.add(obj);
			}
		} catch (Exception e) {
			System.out.println("this is get_all_insert method in dao="+e);
			
		}
		return donorobj;
	}
	
	public ArrayList<LoginModel> get_all_admin()
	{
		ArrayList<LoginModel> logobj=new ArrayList<LoginModel>();
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
				
				LoginModel obj=new LoginModel(name, email, pass, ph, cr, id);
				logobj.add(obj);
				
			}
		} catch (Exception e) {
			System.out.println("this is get_all_admin method in dao="+e);
			
		}
		return logobj;
	}
	public int Approval_insert(ApprovalModel Ap)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement ps=null;
		int res=0;
		try {
			ps=con.prepareStatement("insert into approvals(request_id,donor_id,admin_id,status,approval_date)values(?,?,?,?,?)");
			//ps.setInt(1, Ap.getApproval_id());
			ps.setInt(1, Ap.getRequest_id());
			ps.setInt(2, Ap.getDonor_id());
			ps.setInt(3, Ap.getAdmin_id());
			ps.setString(4, Ap.getStatus());
			ps.setString(5, Ap.getApproval_date());
			
			res=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("this is Approval_insert method in dao="+e);
		}
		return res;
	}
	
	
	public ArrayList<ApprovalModel> get_all_approval()
	{
		ArrayList<ApprovalModel> appobj=new ArrayList<ApprovalModel>();
		con=ConectionProvider.getConnection();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			ps=con.prepareStatement("select * from approvals");
			rs=ps.executeQuery();
			while(rs.next())
			{
				int aid=rs.getInt(1);
				int rid=rs.getInt(2);
				int did=rs.getInt(3);
				int adid=rs.getInt(4);
				String st=rs.getString(5);
				String ada=rs.getString(6);
				
				ApprovalModel obj= new ApprovalModel(st,ada,aid,rid,did,adid);
				appobj.add(obj);
				
			}
		} catch (Exception e) {
			System.out.println("this is get_all_approval method in dao="+e);
		}
		return appobj;
	}
	
	
	
	public int approval_update(ApprovalModel Am)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement ps=null;
		
		int res=0;
		
		try {
			ps=con.prepareStatement("update approvals set status=?,approval_date=? where approve_id=?");
			ps.setString(1, Am.getStatus());
			ps.setString(2, Am.getApproval_date());
			ps.setInt(3, Am.getApproval_id());
			
			System.out.println("update model="+Am);
			res=ps.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("this is approval_update method in dao="+e);
		}
		return res;
	}
	
	
	
	public int approval_delete(int app_id)
	{
		con=ConectionProvider.getConnection();
		PreparedStatement st=null;
		
		int res=0;
		
		try {
			st=con.prepareStatement("delete from approvals where approve_id=?");
			st.setInt(1,app_id );
			
			res=st.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("this is approval_delete method in dao="+e);
		}
		return res;
	}
}

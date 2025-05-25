package Model;
import java.io.*;
public class InventoryModel {
	String bl_group,u_d;
	int qty,bl_id;
	public InventoryModel() {
		super();
		
	}
	
	

	public InventoryModel(String bl_group, int qty,String u_d) {
		super();
		this.bl_group = bl_group;
		this.qty = qty;
		this.u_d=u_d;
	}



	public InventoryModel(String bl_group, String u_d, int qty, int bl_id) {
		super();
		this.bl_group = bl_group;
		this.u_d = u_d;
		this.qty = qty;
		this.bl_id = bl_id;
	}
	public String getBl_group() {
		return bl_group;
	}
	public void setBl_group(String bl_group) {
		this.bl_group = bl_group;
	}
	public String getU_d() {
		return u_d;
	}
	public void setU_d(String u_d) {
		this.u_d = u_d;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getBl_id() {
		return bl_id;
	}
	public void setBl_id(int bl_id) {
		this.bl_id = bl_id;
	}
	
	
}

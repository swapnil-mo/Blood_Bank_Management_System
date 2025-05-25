package Model;

public class RequestModel {
	String bl_group,request_reason,quantity;
	int request_id,user_id;
	public RequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequestModel(String bl_group, String request_reason, String quantity, int request_id, int user_id) {
		super();
		this.bl_group = bl_group;
		this.request_reason = request_reason;
		this.quantity = quantity;
		this.request_id = request_id;
		this.user_id = user_id;
	}
	public RequestModel(String bl_group, String request_reason, String quantity, int user_id) {
		super();
		this.bl_group = bl_group;
		this.request_reason = request_reason;
		this.quantity = quantity;
		this.user_id = user_id;
	}
	public String getBl_group() {
		return bl_group;
	}
	public void setBl_group(String bl_group) {
		this.bl_group = bl_group;
	}
	public String getRequest_reason() {
		return request_reason;
	}
	public void setRequest_reason(String request_reason) {
		this.request_reason = request_reason;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "RequestModel [bl_group=" + bl_group + ", request_reason=" + request_reason + ", quantity=" + quantity
				+ ", request_id=" + request_id + ", user_id=" + user_id + "]";
	}
	
	
	
	
}

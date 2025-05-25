package Model;

public class ActivityModel {
	
	String activity_name,performed_at;
	int log_id,admin_id;
	public ActivityModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ActivityModel(String activity_name, String performed_at, int log_id, int admin_id) {
		super();
		this.activity_name = activity_name;
		this.performed_at = performed_at;
		this.log_id = log_id;
		this.admin_id = admin_id;
	}
	public ActivityModel(String activity_name, String performed_at, int admin_id) {
		super();
		this.activity_name = activity_name;
		this.performed_at = performed_at;
		this.admin_id = admin_id;
	}
	public String getActivity_name() {
		return activity_name;
	}
	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}
	public String getPerformed_at() {
		return performed_at;
	}
	public void setPerformed_at(String performed_at) {
		this.performed_at = performed_at;
	}
	public int getLog_id() {
		return log_id;
	}
	public void setLog_id(int log_id) {
		this.log_id = log_id;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	@Override
	public String toString() {
		return "ActivityModel [activity_name=" + activity_name + ", performed_at=" + performed_at + ", log_id=" + log_id
				+ ", admin_id=" + admin_id + "]";
	}
	
	
	

}

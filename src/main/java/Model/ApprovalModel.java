package Model;

public class ApprovalModel {
	String status,approval_date;
	int approval_id,request_id,donor_id,admin_id;
	public ApprovalModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public ApprovalModel(String status, String approval_date, int approval_id) {
		super();
		this.status = status;
		this.approval_date = approval_date;
		this.approval_id = approval_id;
	}


	public ApprovalModel(String status, String approval_date, int approval_id, int request_id, int donor_id,
			int admin_id) {
		super();
		this.status = status;
		this.approval_date = approval_date;
		this.approval_id = approval_id;
		this.request_id = request_id;
		this.donor_id = donor_id;
		this.admin_id = admin_id;
	}
	public ApprovalModel(String status, String approval_date, int request_id, int donor_id, int admin_id) {
		super();
		this.status = status;
		this.approval_date = approval_date;
		this.request_id = request_id;
		this.donor_id = donor_id;
		this.admin_id = admin_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getApproval_date() {
		return approval_date;
	}
	public void setApproval_date(String approval_date) {
		this.approval_date = approval_date;
	}
	public int getApproval_id() {
		return approval_id;
	}
	public void setApproval_id(int approval_id) {
		this.approval_id = approval_id;
	}
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	public int getDonor_id() {
		return donor_id;
	}
	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	@Override
	public String toString() {
		return "ApprovalModel [status=" + status + ", approval_date=" + approval_date + ", approval_id=" + approval_id
				+ ", request_id=" + request_id + ", donor_id=" + donor_id + ", admin_id=" + admin_id + "]";
	}
	
	
	
	
}

package Model;

public class DonorModel {
	String donor_name,bl_group,date_birth,last_date,addre;
	int donor_id,user_id;
	public DonorModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DonorModel(String donor_name, String bl_group, String date_birth, String last_date, String addre,
			int donor_id, int user_id) {
		super();
		this.donor_name = donor_name;
		this.bl_group = bl_group;
		this.date_birth = date_birth;
		this.last_date = last_date;
		this.addre = addre;
		this.donor_id = donor_id;
		this.user_id = user_id;
	}
	public DonorModel(String donor_name, String bl_group, String date_birth, String last_date, String addre,
			int user_id) {
		super();
		this.donor_name = donor_name;
		this.bl_group = bl_group;
		this.date_birth = date_birth;
		this.last_date = last_date;
		this.addre = addre;
		this.user_id = user_id;
	}
	public String getDonor_name() {
		return donor_name;
	}
	public void setDonor_name(String donor_name) {
		this.donor_name = donor_name;
	}
	public String getBl_group() {
		return bl_group;
	}
	public void setBl_group(String bl_group) {
		this.bl_group = bl_group;
	}
	public String getDate_birth() {
		return date_birth;
	}
	public void setDate_birth(String date_birth) {
		this.date_birth = date_birth;
	}
	public String getLast_date() {
		return last_date;
	}
	public void setLast_date(String last_date) {
		this.last_date = last_date;
	}
	public String getAddre() {
		return addre;
	}
	public void setAddre(String addre) {
		this.addre = addre;
	}
	public int getDonor_id() {
		return donor_id;
	}
	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "DonorModel [donor_name=" + donor_name + ", bl_group=" + bl_group + ", date_birth=" + date_birth
				+ ", last_date=" + last_date + ", addre=" + addre + ", donor_id=" + donor_id + ", user_id=" + user_id
				+ "]";
	}
	
	
	
}

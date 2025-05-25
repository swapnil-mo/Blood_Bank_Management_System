package Model;

public class U_DonationModel {
	String donor_name,first_time,blood_group,donation_date,quantity,contact_no;
	int donation_id,donor_id;
	
	public U_DonationModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public U_DonationModel(String donor_name, String first_time, String blood_group, String donation_date,
			String quantity, String contact_no, int donation_id, int donor_id) {
		super();
		this.donor_name = donor_name;
		this.first_time = first_time;
		this.blood_group = blood_group;
		this.donation_date = donation_date;
		this.quantity = quantity;
		this.contact_no = contact_no;
		this.donation_id = donation_id;
		this.donor_id = donor_id;
	}

	public U_DonationModel(String donor_name, String first_time, String blood_group, String donation_date,
			String quantity, String contact_no, int donor_id) {
		super();
		this.donor_name = donor_name;
		this.first_time = first_time;
		this.blood_group = blood_group;
		this.donation_date = donation_date;
		this.quantity = quantity;
		this.contact_no = contact_no;
		this.donor_id = donor_id;
	}

	public String getDonor_name() {
		return donor_name;
	}

	public void setDonor_name(String donor_name) {
		this.donor_name = donor_name;
	}

	public String getFirst_time() {
		return first_time;
	}

	public void setFirst_time(String first_time) {
		this.first_time = first_time;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getDonation_date() {
		return donation_date;
	}

	public void setDonation_date(String donation_date) {
		this.donation_date = donation_date;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public int getDonation_id() {
		return donation_id;
	}

	public void setDonation_id(int donation_id) {
		this.donation_id = donation_id;
	}

	public int getDonor_id() {
		return donor_id;
	}

	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
	}

	@Override
	public String toString() {
		return "U_DonationModel [donor_name=" + donor_name + ", first_time=" + first_time + ", blood_group="
				+ blood_group + ", donation_date=" + donation_date + ", quantity=" + quantity + ", contact_no="
				+ contact_no + ", donation_id=" + donation_id + ", donor_id=" + donor_id + "]";
	}
	
	
}

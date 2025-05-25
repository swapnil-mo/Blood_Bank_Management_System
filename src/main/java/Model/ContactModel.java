package Model;

public class ContactModel {
	String contact_name,contact_address,contact_message;
	int contact_id;
	public ContactModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactModel(String contact_name, String contact_address, String contact_message) {
		super();
		this.contact_name = contact_name;
		this.contact_address = contact_address;
		this.contact_message = contact_message;
	}
	public ContactModel(String contact_name, String contact_address, String contact_message, int contact_id) {
		super();
		this.contact_name = contact_name;
		this.contact_address = contact_address;
		this.contact_message = contact_message;
		this.contact_id = contact_id;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getContact_address() {
		return contact_address;
	}
	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}
	public String getContact_message() {
		return contact_message;
	}
	public void setContact_message(String contact_message) {
		this.contact_message = contact_message;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	@Override
	public String toString() {
		return "ContactModel [contact_name=" + contact_name + ", contact_address=" + contact_address
				+ ", contact_message=" + contact_message + ", contact_id=" + contact_id + "]";
	}
	
	
}

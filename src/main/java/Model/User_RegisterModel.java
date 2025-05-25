package Model;

public class User_RegisterModel {
	String name,pass,email,ph;
	
	private int uid;
	public User_RegisterModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User_RegisterModel(String name, String pass, String email, String ph, int uid) {
		super();
		this.name = name;
		this.pass = pass;
		
		this.email = email;
		this.ph = ph;
		this.uid = uid;
	}

	public User_RegisterModel(String name, String pass, String ph, String email) {
		super();
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.ph=ph;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

//	@Override
//	public String toString() {
//		return "User_RegisterModel [name=" + name + ", pass=" + pass + ", email=" + email + ", ph="
//				+ ph + ", uid=" + uid + "]";
//	}

	
	
	
}

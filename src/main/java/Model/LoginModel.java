package Model;

public class LoginModel {
	String name,email,pass,ph,crat;
	private int admin;
	
	
	public LoginModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public LoginModel(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}
	
	
	public LoginModel(String name, String email, String pass, String ph, String crat, int admin) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.ph = ph;
		this.crat = crat;
		this.admin = admin;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public String getCrat() {
		return crat;
	}
	public void setCrat(String crat) {
		this.crat = crat;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}

	
	
}

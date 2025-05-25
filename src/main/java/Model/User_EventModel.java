package Model;

public class User_EventModel {
	String ename,edesc,eaddress,edate;
	int eid;
	public User_EventModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User_EventModel(String ename, String edesc, String eaddress, String edate, int eid) {
		super();
		this.ename = ename;
		this.edesc = edesc;
		this.eaddress = eaddress;
		this.edate = edate;
		this.eid = eid;
	}
	
	
	public User_EventModel(String ename, String edesc, String eaddress, String edate) {
		super();
		this.ename = ename;
		this.edesc = edesc;
		this.eaddress = eaddress;
		this.edate = edate;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesc() {
		return edesc;
	}
	public void setEdesc(String edesc) {
		this.edesc = edesc;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "User_EventModel [ename=" + ename + ", edesc=" + edesc + ", eaddress=" + eaddress + ", edate=" + edate
				+ ", eid=" + eid + "]";
	}
	
	
}

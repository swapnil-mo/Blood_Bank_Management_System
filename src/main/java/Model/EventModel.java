package Model;

public class EventModel {
	String e_name,e_desc,loc,e_date;
	int event_id,ad_id;
	public EventModel() {
		super();
		
	}

	public EventModel(String e_name, String e_desc, String loc, String e_date, int ad_id) {
		super();
		this.e_name = e_name;
		this.e_desc = e_desc;
		this.loc = loc;
		this.e_date = e_date;
		this.ad_id = ad_id;
	}


	public EventModel(String e_name, String e_desc, String loc, String e_date, int event_id, int ad_id) {
		super();
		this.e_name = e_name;
		this.e_desc = e_desc;
		this.loc = loc;
		this.e_date = e_date;
		
		this.event_id = event_id;
		this.ad_id = ad_id;
		
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_desc() {
		return e_desc;
	}
	public void setE_desc(String e_desc) {
		this.e_desc = e_desc;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getE_date() {
		return e_date;
	}
	public void setE_date(String e_date) {
		this.e_date = e_date;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public int getAd_id() {
		return ad_id;
	}
	public void setAd_id(int ad_id) {
		this.ad_id = ad_id;
	}

	@Override
	public String toString() {
		return "EventModel [e_name=" + e_name + ", e_desc=" + e_desc + ", loc=" + loc + ", e_date=" + e_date
				+ ", event_id=" + event_id + ", ad_id=" + ad_id + "]";
	}
	
	
	
	
	
}

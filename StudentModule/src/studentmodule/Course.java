package studentmodule;
public class Course {
	private String title;
	private String code;
	private String ltps;
	private int credits;
	public Course()
	{
		
	}
	public Course(String title,String code,String ltps,int credits)
	{
		this.title=title;
		this.code=code;
		this.ltps=ltps;
		this.credits=credits;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLtps() {
		return ltps;
	}
	public void setLtps(String ltps) {
		this.ltps = ltps;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
}
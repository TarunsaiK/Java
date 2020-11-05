package studentmodule;

public class Student {
	private String name;
	private int rolno;
	private Course c;
	Student()
	{
		
	}
	Student(String name,int rolno,Course c)
	{
		this.name=name;
		this.rolno=rolno;
		this.c=c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRolno() {
		return rolno;
	}
	public void setRolno(int rolno) {
		this.rolno = rolno;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	
}
package highschool;

public class CollegeStudent extends Student {
	int Year;
	String Major;
	CollegeStudent(String Name,int Year,String Major,long id)
	{
		super(Name,id);
		this.Year=Year;
		this.Major=Major;
	}
	public String toString()
	{
		String de=super.toString();
		return de+" Year : "+Year+" Major : "+Major+"\n";
	}
}

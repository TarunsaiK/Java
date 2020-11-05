package highschool;

public class Student extends Person{
	long id;
	Student(String Name,long id)
	{
		super(Name);
		this.id=id;
	}
	public String toString()
	{
		String Name =super.toString();
		return "Name : "+Name+" ID : "+id;
	}
}

package highschool;

public class Teacher extends Person {
  int Salary;
  String Subject;
  Teacher(String Name,int Salary,String Subject)
  {
	  super(Name);
	  this.Name=Name;
	  this.Salary=Salary;
	  this.Subject=Subject;
  }
  public String toString()
  {
	  String Name=super.toString();
	  return Name+"Subject : "+Subject+" Salary: "+Salary+"\n";
  }
}

package studentmodule;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1=new Course("ATCD","17CS2070","3-2-0",4);
		Course c2=new Course("CC","17CS1800","3-2-0",4);
		Student s1=new Student("Tarunsai",30656,c1);
		Student s2=new Student("Tarunsai",30656,c2);
		System.out.print(s1.getName()+"\t");
		System.out.print(s1.getC().getTitle()+"\t");
		System.out.print(s1.getC().getCode()+"\t");
		System.out.print(s1.getC().getLtps()+"\t");
		System.out.println(s1.getC().getCredits());
		System.out.print(s2.getName()+"\t");
		System.out.print(s2.getC().getTitle()+"\t");
		System.out.print(s2.getC().getCode()+"\t");
		System.out.print(s2.getC().getLtps()+"\t");
		System.out.print(s2.getC().getCredits()+"\t");

	}

}
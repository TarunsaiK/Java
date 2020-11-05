package com.mile1.main;
import com.mile1.bean.*;
import com.mile1.service.*;
import com.mile1.exception.*;
public class StudentMain {
	static Student data[]=new Student[4];
	StudentMain()
	{
		for(Student Data:data)
		{
			Data=new Student();
		}
		data [0] = new Student("Sekar", new int []{85,75,95});
		data [1] = new Student ("Namaste", new int[]{11,22,33});
		data [2] = null;
		data [3] = new Student ("null", null);

	}
	public static void main(String[] arg)
	{
		new StudentMain();
		
			StudentReport s=new StudentReport();
			for(Student i:data)
			{
				try {
					if(s.validate(i)=="VALID")
					{
						System.out.println("Grade for student"+i.getName()+" is "+s.findGrades(i));
					}
				}
				catch(NullStudentObjectException e)
				{
					e.printStackTrace();
				}
				catch(NullNameException e)
				{
					e.printStackTrace();
				}
				catch(NullMarksArrayException e)
				{
					e.printStackTrace();
				}
			}
			StudentService SS=new StudentService();
			System.out.println(SS.findNumberOfNullMarksArray(data));
			System.out.println(SS.findNumberOfNullName(data));
			System.out.println(SS.findNumberOfNullObjects(data));
		
	}
}

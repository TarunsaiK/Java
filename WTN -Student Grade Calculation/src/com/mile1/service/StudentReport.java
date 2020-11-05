package com.mile1.service;
import com.mile1.bean.*;
import com.mile1.exception.*;
public class StudentReport {
public String findGrades(Student studentObject)
{
	//int [] marks=studentObject.getMarks();
	String grade="";
	int sum=0;
	for(int i:studentObject.getMarks())
	{
		if(i<35) {
			grade="F";
			break;
		}
		else
		{
			sum+=i;
		}
			
	}
	if(sum<150)
		grade="C";
	else if (sum<200)
		grade="B";
	else if(sum<250)
		grade="A";
	else
		grade="A+";
	return grade;
}

public String validate(Student s)throws NullNameException, NullMarksArrayException,
NullStudentObjectException
{
		if(s == null)
			throw new NullStudentObjectException();
		else
		{
			if(s.getName()==null)
				throw new NullNameException();
			else if(s.getMarks()==null)
				throw new NullMarksArrayException();
			else
				return "VALID";
		}
}


}

package com.validation;

import java.time.LocalDate;

import com.Exception.StudentException;
import com.app.Course;
import com.app.Student;

public class StudentValidationRules {

	public static Student ValidateAllStudents(int id, String firstname, String lastname, String email, String dob,String course) throws StudentException
	{
		LocalDate DOB=parseDate(dob);
		Course cs=ParseEnum(course);
		return new Student(id,firstname,lastname,email,DOB,cs);
	}
	
	private static LocalDate parseDate(String dob) throws StudentException
	{
		//conversion of string into LocalDate format
		LocalDate dateofbirth=LocalDate.parse(dob);
//		String date="2000-02-01";
//		LocalDate validate=LocalDate.parse(date);
//		
//		if(dateofbirth.isBefore(validate))
//			throw new StudentException("Invalid Student");
		return dateofbirth;
	}
	
	private static Course ParseEnum(String course)
	{
		//converion of String into course data type
		Course c=Course.valueOf(course.toUpperCase());
		return c;
	}
}

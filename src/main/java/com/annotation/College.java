package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component (value="colz")
public class College {
	
	@Value("NCC")
	private String name;
	
	@Value("9846321785")
	private String phone;
	
	@Autowired//has a relationship//bean injection
	private Student student;
	
	@Autowired
	//@Qualifier (value = "mathTeacherServiceImpl")
	private TeacherService ts;
	
	public void printCollege() {
		
		System.out.println("College Name = "+ name);
		System.out.println("College Phone= "+ phone);
		student.printStudent();
		ts.teach();
	}
}

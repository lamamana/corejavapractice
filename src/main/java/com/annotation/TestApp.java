package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		College c = (College) context.getBean("getCollegeBean");
		c.printCollege();
		
//		Student s = (Student) context.getBean("getStudentBean");
//		s.printStudent();
	}

}

package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s = (Student) context.getBean("stud");
		System.out.println(s);
		
		Employee e = context.getBean("emp", Employee.class);
		System.out.println(e);

	}

}

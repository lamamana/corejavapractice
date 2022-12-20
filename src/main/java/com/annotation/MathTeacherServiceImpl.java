package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class MathTeacherServiceImpl implements TeacherService{

	@Override
	public void teach() {
		System.out.println("Teaching Math...........");
		
	}

}

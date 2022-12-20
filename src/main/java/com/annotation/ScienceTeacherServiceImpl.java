package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacherServiceImpl implements TeacherService{

	@Override
	public void teach() {
		System.out.println("Teaching Science..............");
		
	}

}

package com.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//start spring container
@ComponentScan(basePackages ="com.annotation")
public class AppConfig {

	@Bean//(name="clz")
	public College getCollegeBean() {
		
		return new College();
	}
	
	@Bean
	public Student getStudentBean() {
		return new Student();
	}
}

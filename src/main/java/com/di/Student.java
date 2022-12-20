package com.di;

public class Student {
private int id;
private String fname;
private String lname;
private int age;
private String college;

public Student(int id, String fname, String lname, int age, String college) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.age = age;
	this.college = college;
}
@Override
public String toString() {
	return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", college=" + college
			+ "]";
}

}

package com.kim.ch07Project;

public class StudentDTO {
	private String name;
	private int age;
	private String phoneNo;
	private boolean student;
	
	public StudentDTO() {
		super();
	}
	
	public StudentDTO(String name, int age, String phoneNo, boolean student) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.student = student;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public boolean isStudent() {
		return student;
	}
	public void setStudent(boolean student) {
		this.student = student;
	}
	

}

package com.kim.ch14Project;

public class Student implements Comparable<Student> {
	private String name;
	private int ban;
	private int totalScore;
	
	@Override
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}

	public Student() {
		super();
	}

	public Student(String name, int ban, int totalScore) {
		super();
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	//Object에 있는 toString()을 재정의
	@Override
	public String toString() {
		//Object의 toString()은 객체의 주소를 반환
		return String.format("[%s,%d,%d]", name, ban, totalScore);
	}

}

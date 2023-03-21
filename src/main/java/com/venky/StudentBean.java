package com.venky;

public class StudentBean {
	private int m1;
	private int m2;
	private int m3;
	private String name;
	private int id;
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "StudentBean [getM1()=" + getM1() + ", getM2()=" + getM2() + ", getM3()=" + getM3() + ", getName()="
				+ getName() + ", getId()=" + getId() + "]";
	}
	int total=0;double average=0;
	public void printTotal() {
		 total=m1+m2+m3;
		System.out.println("Toatal Marks:"+total);
	}
	public void printAverage() {
		 average=total/3;
		 System.out.println("Average:"+average);
	}
	public void printGrade() {
		if(average>=70)
			System.out.println("A Grade");
		else if(average>=60) {
			System.out.println("B Grade");
		}
		else if(average>=50) {
			System.out.println("C Grade");
		}
		else {
			System.out.println("Fail");
		}
	}
	
}

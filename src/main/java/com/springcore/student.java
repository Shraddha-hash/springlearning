package com.springcore;

public class student {
	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

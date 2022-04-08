package com.springcore.constructorInj;

import java.util.List;

public class person {
	private String name;
	private int id;
	private Certificate c;
	private List<String> phone;
	
	public person(String name, int id,Certificate c,List<String> phone) {
		this.name = name;
		this.id = id;
		this.c=c;
		this.phone=phone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+":"+this.id+":"+this.c+":"+this.phone;
	}
}

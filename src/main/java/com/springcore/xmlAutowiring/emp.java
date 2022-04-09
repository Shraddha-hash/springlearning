package com.springcore.xmlAutowiring;

public class emp {
	private address add;

	@Override
	public String toString() {
		return "emp [add=" + add + "]";
	}

	public address getAdd() {
		return add;
	}

	public void setAdd(address add) {
		this.add = add;
	}

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public emp(address add) {
		super();
		System.out.println("Inside constructor");
		this.add = add;
	} 
}

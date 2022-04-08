package com.springcore.constructorInj;

public class Certificate {
	String nm;

	public Certificate(String nm) {
		super();
		this.nm = nm;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nm;
	}
	
}

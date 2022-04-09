package com.springcore.beanLifecycle;

public class samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting price");
		this.price = price;
	}

	@Override
	public String toString() {
		return "samosa [price=" + price + "]";
	}

	public samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void init()
	{
		System.out.println("inside init()");
	}
	
	public void destroy()
	{
		System.out.println("inside destroy()");
	}
}

package com.springcore.beanLifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean, DisposableBean {
	private double price;

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Taking pepsi");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("pepsi khatam");
	}
}

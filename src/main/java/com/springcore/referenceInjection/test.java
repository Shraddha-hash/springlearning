package com.springcore.referenceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/referenceInjection/refConfig.xml");
		A a=(A)context.getBean("a");
		System.out.println(a);
		System.out.println(a.getX());
		System.out.println(a.getOb().getY());
		
		A c=(A)context.getBean("c");
		System.out.println(c);
		
		B b=(B)context.getBean("b");
		System.out.println(b);
	}

}

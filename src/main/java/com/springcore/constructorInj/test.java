package com.springcore.constructorInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructorInj/CIonfig.xml");
		person p=(person)context.getBean("person");
		
		System.out.println(p);

		person p1=(person)context.getBean("person1");
		System.out.println(p1);
	}

}

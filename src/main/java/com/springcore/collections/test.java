package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/empConfig.xml");
		employees emp=(employees)context.getBean("emp1");
		
		System.out.println(emp);
		
	}

}

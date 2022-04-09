package com.springcore.xmlAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/xmlAutowiring/xmlautoconfig.xml");
		emp empl=context.getBean("empl",emp.class);
		System.out.println(empl);

	}

}

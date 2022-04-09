package com.springcore.beanLifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/beanLifecycle/samosaConfig.xml");
//		samosa sam=(samosa)context.getBean("sam");
//		System.out.println(sam);
		//registering shutdown hook
		context.registerShutdownHook();
		
/*		System.out.println("-------------------------------------------------");
		pepsi p=(pepsi)context.getBean("pep");
		System.out.println(p);
		//no need of registering shutdownhook double
		//context.registerShutdownHook();*/
		
		water wat=(water)context.getBean("wat");
		System.out.println(wat);
	}

}

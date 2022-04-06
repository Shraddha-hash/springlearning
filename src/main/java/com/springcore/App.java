package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        student st1=(student)context.getBean("stud1");  
        System.out.println(st1);
        
        student st2=(student)context.getBean("stud2");
        System.out.println(st2);
        
        student st3=(student)context.getBean("stud3");
        System.out.println(st3);
        
    }
}

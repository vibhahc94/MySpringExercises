package com.vibha.spring.springcore.constructorinjection;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springcore/constructorinjection/ciconfig.xml");
		Employee e = (Employee) ctx.getBean("employee");
		System.out.println(e);
		
	
	}

}

package com.vibha.spring.springcore.lifecycle.springInterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springcore/lifecycle/springInterfaces/interfacesconfig.xml");
		Patient patient = (Patient) ctx.getBean("patient");
		System.out.println(patient);
		ctx.registerShutdownHook();
	}

}

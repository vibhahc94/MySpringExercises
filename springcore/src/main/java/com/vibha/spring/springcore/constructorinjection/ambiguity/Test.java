package com.vibha.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springcore/constructorinjection/ambiguity/config.xml");
		Addition obj = (Addition) ctx.getBean("addition");
		System.out.println(obj);

	}

}

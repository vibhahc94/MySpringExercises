package com.vibha.spring.springcoreadvanced.autowiring.annotations.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springcoreadvanced/autowiring/annotations/qualifier/config.xml");
		Employee e = (Employee) ctx.getBean("employee");
		System.out.println(e);
	}

}
package com.vibha.spring.springcore.assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springcore/assignment4/config.xml");
		Client c = (Client) ctx.getBean("client");
		System.out.println(c);

	}

}

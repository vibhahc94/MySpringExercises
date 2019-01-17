package com.vibha.spring.springcore.assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vibha.spring.springcore.assignment4.Client;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springcore/assignment5/config.xml");
		Customer c = (Customer) ctx.getBean("customer");
		System.out.println(c);
	}

}

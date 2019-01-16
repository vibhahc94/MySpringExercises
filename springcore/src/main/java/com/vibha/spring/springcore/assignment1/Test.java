package com.vibha.spring.springcore.assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springcore/assignment/testconfig.xml");
		ShoppingCart shoppingcart = (ShoppingCart) ctx.getBean("shoppingcart");
		System.out.println(shoppingcart);
	}

}

package com.vibha.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springcore/set/setconfig.xml");
		CarDealer cardealer = (CarDealer) ctx.getBean("cardealer");
		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModels().getClass().getName());
	}

}

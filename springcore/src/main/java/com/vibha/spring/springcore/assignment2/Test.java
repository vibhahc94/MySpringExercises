package com.vibha.spring.springcore.assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springcore/assignment2/test2config.xml");
		TicketReservation ticketreservation = (TicketReservation) ctx.getBean("ticketreservation");
		//System.out.println(ticketreservation);
		ctx.registerShutdownHook();
	}

}

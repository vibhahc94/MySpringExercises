package com.vibha.spring.springcore.assignemnt3;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springcore/assignemnt3/workconfig.xml");
		University university1 = (University) ctx.getBean("university");
		System.out.println(university1.hashCode());
		System.out.println(university1);
		
		University university2 = (University) ctx.getBean("university");
		System.out.println(university2.hashCode());
		System.out.println(university2);
		
	}

}

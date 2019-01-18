package com.vibha.spring.springcoreadvanced.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vibha.spring.springcoreadvanced.standalone.collections.ProductsList;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/vibha/spring/springcoreadvanced/stereotype/annotation/config.xml");
		Instructor i1 = (Instructor) ctx.getBean("inst");
		System.out.println(i1);

		Instructor i2 = (Instructor) ctx.getBean("inst");
		System.out.println(i2);

	}

}

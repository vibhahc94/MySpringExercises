package com.vibha.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/vibha/spring/springcore/properties/propconfig.xml");
		CountriesAndLanguages countriesAndLangs = (CountriesAndLanguages) ctx.getBean("countriesAndLangs");
		System.out.println(countriesAndLangs);
		
	}

}

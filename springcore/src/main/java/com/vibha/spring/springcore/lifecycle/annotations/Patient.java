package com.vibha.spring.springcore.lifecycle.annotations;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter method");
		this.id = id;
	}
	
	@PostConstruct
	public void hi()
	{
		System.out.println("Inside hi method");
	}
	
	@PreDestroy
	public void bye()
	{
		System.out.println("Inside bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	

}

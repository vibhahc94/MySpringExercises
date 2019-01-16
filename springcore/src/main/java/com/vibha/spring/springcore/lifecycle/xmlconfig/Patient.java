package com.vibha.spring.springcore.lifecycle.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside Setter method");
		this.id = id;
	}
	
	public void hi()
	{
		System.out.println("Inside hi method");
	}
	
	public void bye()
	{
		System.out.println("Inside bye method");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

}

package com.vibha.spring.springcore.propertyplaceholder;

public class MyDAO {
	private String dbSserver;

	public MyDAO(String dbSserver) {
		this.dbSserver = dbSserver;
	}

	@Override
	public String toString() {
		return "MyDAO [dbSserver=" + dbSserver + "]";
	}
	
	
	
	

}

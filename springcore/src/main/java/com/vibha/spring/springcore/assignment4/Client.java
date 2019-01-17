package com.vibha.spring.springcore.assignment4;

public class Client {

	private String url;
	private String uName;
	private String password;
	
	
	
	

	public Client(String url, String uName, String password) {

		this.url = url;
		this.uName = uName;
		this.password = password;
	}
	

	@Override
	public String toString() {
		return "Client [url=" + url + ", uName=" + uName + ", Password=" + password + "]";
	}
	

}

package com.vibha.spring.springcore.assignment4;

public class Client {

	private String url;
	private String userName;
	private String password;
	
	
	
	

	public Client(String url, String userName, String password) {

		this.url = url;
		this.userName = userName;
		this.password = password;
	}
	

	@Override
	public String toString() {
		return "Client [url=" + url + ", userName=" + userName + ", Password=" + password + "]";
	}
	

}

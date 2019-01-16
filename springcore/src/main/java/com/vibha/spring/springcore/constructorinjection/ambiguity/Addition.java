package com.vibha.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	/*Addition(int a, int b) {
		System.out.println("Inside Int Constructor");
	}

	Addition(double a, double b) {
		System.out.println("Inside double Constructor");
	}

	Addition(String a, String b) {
		System.out.println("Inside String Constructor");
	}*/
	Addition(int a, double b) {
		System.out.println("Inside Constructor");
		System.out.println(a);
		System.out.println(b);
	}

}

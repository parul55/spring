package com.zensar.spring.simple;

public class FestivalGreeting implements Greeting {

	
	public FestivalGreeting() {
		System.out.println("FestivalGreeting Created.");
	}
	
	public String sayGreet() {
		
		return "Happy Holi";
	}

}

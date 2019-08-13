package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("holi")
public class FestivalGreeting implements Greeting {

	public FestivalGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("FestivalGreeting Created.");
	}
	public String sayGreet() {
		
		return "Happy holi !!";
	}

}

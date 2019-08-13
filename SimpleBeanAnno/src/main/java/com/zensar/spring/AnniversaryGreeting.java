package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("anni")
public class AnniversaryGreeting implements Greeting {

	public AnniversaryGreeting() {
		System.out.println("AnniversaryGreeting Created.");
	}
	public String sayGreet() {
		
		return "YEYEYEYEYEYEYE !!";
	}

}

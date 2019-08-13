package com.zensar.spring;
/*
 * Author: Parul Singh
 * Creation Date: 27th Jul 2019 12:46PM IST
 * Modified Date: 27th Jul 2019 12:46PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies.All Rights Reserved
 * Description:It is specialized greetings used to greet anybody on his/her birthday.
 * 
 * 
 */
public class BirthdayGreeting implements Greeting {
	public BirthdayGreeting(){
	System.out.println("Birthday Greeting created");
	}
	
	public String sayGreet() {
		
		return "Wish you a very Happy Birthday";
	}

}

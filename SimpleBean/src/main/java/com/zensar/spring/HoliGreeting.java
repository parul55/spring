package com.zensar.spring;
/*
 * Author: Parul Singh
 * Creation Date: 27th Jul 2019 12:46PM IST
 * Modified Date: 27th Jul 2019 12:46PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies.All Rights Reserved
 * Description:It is specialized greetings used to greet anybody on
 * occasion of India's great festival Holi.
 */
public class HoliGreeting implements Greeting {

	
	public HoliGreeting(){
		System.out.println("HoliGreeting created.");
	}
	public String sayGreet() {
		
		return "Happy Holi!! May your life full of colors";
	}

}

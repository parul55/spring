package com.zensar.spring.performers;
/*
 * Author: Parul Singh
 * Creation Date: 27th Jul 2019 12:46PM IST
 * Modified Date: 27th Jul 2019 12:46PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies.All Rights Reserved
 * Description:It is to represent performance of Juggler of Zensar Idol competition
 * Juggler gets bean bags using constructor injection
 * 
 */
public class Juggler implements Performer {

	private int beanBags;
	
	public Juggler(){
		System.out.println("No args constructor");
		
	}
	
	
	
	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("Parameterized constructor");
	}



	public void perform() {
		// TODO Auto-generated method stub
		
		System.out.println("Juggler juggling "+ beanBags);
		
	}

}

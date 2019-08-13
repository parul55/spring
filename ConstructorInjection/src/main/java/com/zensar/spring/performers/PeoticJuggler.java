package com.zensar.spring.performers;

import com.zensar.spring.performers.poems.Poem;

/*
 * Author: Parul Singh
 * Creation Date: 27th Jul 2019 12:46PM IST
 * Modified Date: 27th Jul 2019 12:46PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies.All Rights Reserved
 * Description:More skilled jugller who juggles while reciting a poem.
 * Poem is injected into peoticJugller
 * using Constructor Injection
 */


//Dependency Object Class
public class PeoticJuggler extends Juggler {
	//Dependency Object reference
	private Poem poem;
	
	
	public PeoticJuggler(){
		System.out.println("No-Arg constructor of PoeticJuggler");
	}


	public PeoticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("Parametirized constructor of PoeticJuggler");
	}
	
	
	public void perform(){
		super.perform();
		System.out.println("While reciting a poem");
		poem.recite();
	}
	
	
	
}

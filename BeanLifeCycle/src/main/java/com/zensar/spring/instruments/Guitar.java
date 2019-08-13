package com.zensar.spring.instruments;
/*
 * Author: Parul Singh
 * Creation Date: 27th Jul 2019 12:46PM IST
 * Modified Date: 29th Jul 2019 2:46PM IST
 * Version: 2.0
 * Copyright: Zensar Technologies.All Rights Reserved
 * Description:It is to represent an instrument Guitar
 * n
 * 
 */
public class Guitar implements Instrument {

	public void play() {
		// TODO Auto-generated method stub
		System.out.println("ting ting ting...");
	}

	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is tuned.");
	}

	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("Guitar is untuned");
	}

}

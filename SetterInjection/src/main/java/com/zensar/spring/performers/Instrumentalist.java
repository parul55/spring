package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

/*
 * Author: Parul Singh
 * Creation Date: 27th Jul 2019 12:46PM IST
 * Modified Date: 27th Jul 2019 12:46PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies.All Rights Reserved
 * Description:It is used to represent 
 * Instrumentalist of Zensar Idol Competitons.
 * 
 */
public class Instrumentalist implements Performer {
	
	private String song;
	private Instrument instrument;
	
	
//for setter injection
	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is Set");
	}


//for setter injection
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is set");
	}


//business logic of Instrumentalist
	public void perform() {
		System.out.println("Instrumentalist is playing "+song);
		instrument.play();
	}

}

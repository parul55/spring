package com.zensar.spring.performers.poems;
/*
 * Author: Parul Singh
 * Creation Date: 27th Jul 2019 12:46PM IST
 * Modified Date: 27th Jul 2019 12:46PM IST
 * Version: 1.0
 * Copyright: Zensar Technologies.All Rights Reserved
 * Description:It represents Twinkle Twinkle
 * 
 * 
 */
public class TwinkleTwinkle implements Poem {

	private final static String LINES[]={"Twinkle Twinkle ","Little Star ","How I Wonder What You Are ","Up Above The World So High","Like A Diamond In The Sky"};
	public void recite() {
		// TODO Auto-generated method stub
			for(String line:LINES){
				System.out.println(line);
			}
	}

}

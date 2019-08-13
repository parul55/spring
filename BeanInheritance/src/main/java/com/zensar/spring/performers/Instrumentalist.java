package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;

/*
 * Author: Parul Singh
 * Creation Date: 27th Jul 2019 12:46PM IST
 * Modified Date: 29th Jul 2019 3:40PM IST
 * Version: 3.0
 * Copyright: Zensar Technologies.All Rights Reserved
 * Description:It is used to represent 
 * Instrumentalist of Zensar Idol Competitons.
 * It also show bean life cycle in Spring Framework.
 * 
 */
public class Instrumentalist implements Performer,BeanNameAware {
	
	private String song;
	private Instrument instrument;
	private String beanName;
	
	
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
		System.out.println("Instrumentalist is "+ beanName +" playing "+song);
		instrument.play();
	}

	
	public void setBeanName(String name) {
			this.beanName=name;
			System.out.println("Bean name is set");
	}


	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Spring Core IOC Container BeanFactory is set.");
	}


	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Spring Specialized IOC Conatiner ApplicationContext is set.");
	}


	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//instrument.tune();
		System.out.println("afterPropertiesSet is called.");
	}
	
	public void tuneInstrument(){
		instrument.tune();
		System.out.println("Custom init method");
	}


	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	//	instrument.clean();
		System.out.println("Destroy method is called");
	}
	
	public void cleanInstrument(){
		instrument.clean();
		System.out.println("custom destroy method.");
	}
}

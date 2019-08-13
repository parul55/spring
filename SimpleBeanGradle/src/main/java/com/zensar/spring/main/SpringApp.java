package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.simple.Greeting;

public class SpringApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Greetings.xml");
		Greeting g=context.getBean("holi",Greeting.class);
		System.out.println(g.sayGreet());
	}

}

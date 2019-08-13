package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpingApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Greetings.xml");
        //obtaining readymade object from Spring IOC container
    	Greeting g1=context.getBean("birthday",Greeting.class);
    	//invoking business logic method
    	System.out.println(g1.sayGreet());
    	Greeting g2=context.getBean("holi",Greeting.class);
    	//invoking business logic method
    	System.out.println(g2.sayGreet());
    	
    	Greeting g3=context.getBean("birthday",Greeting.class);
    }
}

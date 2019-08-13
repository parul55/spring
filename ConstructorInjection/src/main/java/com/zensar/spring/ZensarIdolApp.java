package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

/**
 * Hello world!
 *
 */
public class ZensarIdolApp 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("performers.xml");
        Performer p=context.getBean("yasha",Performer.class);
        p.perform();
        
        
        Performer p1=context.getBean("Reema Mehra",Performer.class);
        p1.perform();
    }
}

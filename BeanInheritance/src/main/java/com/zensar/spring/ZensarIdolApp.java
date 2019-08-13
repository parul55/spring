package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
        Performer p=context.getBean("Tina J",Performer.class);
        p.perform();
        
        System.out.println();
        
        p=context.getBean("Meena",Performer.class);
        p.perform();
        
        System.out.println();
        
        p=context.getBean("Geeta",Performer.class);
        p.perform();
        
        System.out.println();
        
        p=context.getBean("Anita",Performer.class);
        p.perform();
        
       //shutting down
        ConfigurableApplicationContext cfgcontext=(ConfigurableApplicationContext) context;
        cfgcontext.close();
    }
}

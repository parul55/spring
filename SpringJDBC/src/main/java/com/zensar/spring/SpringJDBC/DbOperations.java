package com.zensar.spring.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

/**
 * Hello world!
 *
 */
public class DbOperations 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("dbconfig.xml");
        Product product=new Product(4503,"Laptop","Lenovo",28000.00);
        ProductService service=ctx.getBean("productServiceImpl",ProductService.class);
       // service.create(product);
        //service.remove(product);
       // Product product1=new Product(4503,"Laptop","Dell",28000.00);
       // service.edit(product);
       //System.out.println(service.findById(4503));
       
       System.out.println(service.findAllProducts());
    }
}

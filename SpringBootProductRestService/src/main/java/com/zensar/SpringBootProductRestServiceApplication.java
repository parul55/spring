package com.zensar;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
@EnableAutoConfiguration(exclude= {DataSourceAutoConfiguration.class,DataSourceTransactionManagerAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class SpringBootProductRestServiceApplication {
	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductRestServiceApplication.class, args);
		System.out.println("HELLO \n^_^ Yasha  ^_^");
	}
	@Bean(name="dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
		dataSource.setUrl(env.getProperty("spring.datasource.url"));
		dataSource.setUsername(env.getProperty("spring.datasource.username"));
		dataSource.setPassword(env.getProperty("spring.datasource.password"));
		
		System.out.println("## getDataSource: "+dataSource);
		return dataSource;
	}
	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) throws IOException {
		Properties properties=new Properties();
		
		properties.put("hibernate.dialect",env.getProperty("spring.jpa.properties.hibernate.dialect"));
		properties.put("hibernate.show_sql",env.getProperty("spring.jpa.show-sql"));
		LocalSessionFactoryBean factorybean=new LocalSessionFactoryBean();
		//Package contains entity classes
		factorybean.setPackagesToScan(new String[] {"com.zensar.entities"});
		factorybean.setDataSource(dataSource);
		factorybean.setHibernateProperties(properties);
		factorybean.afterPropertiesSet();
		
		SessionFactory sf=factorybean.getObject();
		System.out.println("## getSessonFactory: "+sf);
		return sf;
	}
	
	@Autowired
	@Bean(name="hibernateTemplate")
	public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory) {
		HibernateTemplate hibernateTemplate=new HibernateTemplate(sessionFactory);
		return hibernateTemplate;
	}
	
	@Autowired
	@Bean(name="transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
}

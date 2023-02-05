package it.test.corsospring.annotation;

import java.rmi.registry.Registry;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.test.corsospring.annotation.scan.Role;

public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		confing();
//		configScan();

	}
	
	
	private static void confing()
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User u = context.getBean("userBean", User.class);
		
		System.out.println(u.getUserInfo());
		
		BeanDefinitionRegistry r = (BeanDefinitionRegistry)context.getAutowireCapableBeanFactory();
		r.removeBeanDefinition("userBean");
	}

	private static void configScan()
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigScan.class);
		Role u = context.getBean("role", Role.class);
		System.out.println(u.getRole());
	}
	
	
}

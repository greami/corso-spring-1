package it.test.corsospring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.test.corsospring.aop.bean.OrdineService;


public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		aspect();
		
	}
	
	
	public static void aspect()
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		OrdineService ordine = context.getBean("ordineService", OrdineService.class);
		System.out.println(ordine.getOrdine());
		
	}
	
	public static void proxy()
	{
		ProdottoProxy pp = new ProdottoProxy(new ProdottoImpl());
		System.out.println(pp.getProdotto());
		
	}
	

}

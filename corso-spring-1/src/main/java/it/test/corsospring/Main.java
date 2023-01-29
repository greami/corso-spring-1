package it.test.corsospring;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{

	public static void main(String[] args)
	{
		System.out.println("start");
//		xmlconfig();
//		annotationConfig();
//		xmlconfigFactory();
		xmlconfigFactoryIstanza();
		
	}
	
	
	
	public static void annotationConfig()
	{
		
		System.out.println("-------------");
		System.out.println("Using Annotation ");
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		OrdineService ordine = context.getBean("ordineAnnotation", OrdineService.class);
		String saluto = ordine.hello();
		
		System.out.println(saluto);
		
		
	}
	
	public static void xmlconfig()
	{		
		//metodo per configurazione per
		
		// TODO Auto-generated method stub
		System.out.println("-------------");
		System.out.println("Using XML config");
		//prende in ingresso il nome del file xml che conterrà la definizione dei bean
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		OrdineService ordine = context.getBean("ordine", OrdineService.class);
		String saluto = ordine.hello();
		
		System.out.println(saluto);
	}
	
	
	public static void xmlconfigFactory()
	{		
		//metodo per configurazione per
		
		// TODO Auto-generated method stub
		System.out.println("-------------");
		System.out.println("Using XML config with Facory!");
		
		//prende in ingresso il nome del file xml che conterrà la definizione dei bean
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory.xml");

		OrdineService ordine = context.getBean("ordine", OrdineService.class);
		String saluto = ordine.hello();
		
		System.out.println(saluto);
		
		ProdottoService prodotto = context.getBean("prodotto", ProdottoService.class);
		String saluto2 = prodotto.getProdotto();
		
		System.out.println(saluto2);
	}

	public static void xmlconfigFactoryIstanza()
	{		
		//metodo per configurazione per
		
		// TODO Auto-generated method stub
		System.out.println("-------------");
		System.out.println("Using XML config with Facory with factory-bean!");
		
		//prende in ingresso il nome del file xml che conterrà la definizione dei bean
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-factory-istanza.xml");

		OrdineService ordine = context.getBean("ordine", OrdineService.class);
		String saluto = ordine.hello();
		
		System.out.println(saluto);
		
		ProdottoService prodotto = context.getBean("prodotto", ProdottoService.class);
		String saluto2 = prodotto.getProdotto();
		
		System.out.println(saluto2);
		
		//distuzione di un bean
		BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();		
		registry.removeBeanDefinition("ordine");
	}


}

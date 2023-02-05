package it.test.corsospring;

import java.util.Arrays;

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
//		xmlconfigFactoryIstanza();
//		xmlConfigVariabili();
//		getTipoVariabili();
//		dipendenzaBean();
//		depensOnBean();
//		lazy();
//		autowire();
//		scope();
//		property();
//		propertyContext();
//		annotation();
		annotation2();
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
	
	public static void xmlConfigVariabili()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-variabili.xml");
		
		ClienteService cliente = context.getBean("cliente", ClienteService.class);
		OrdineService ordine  = context.getBean("ordine", OrdineService.class);
		
		System.out.println(cliente.getHelloMessage());
		
		//String[] prod = ordine.listaProdotti();
		Arrays.asList(ordine.listaProdotti()).forEach( p -> {System.out.println("-"+p );});
	}
	
	public static void getTipoVariabili()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-variabili.xml");
		Class<?> type = context.getType("cliente");
		
		System.out.println(type.getName());
	}
	
	public static void dipendenzaBean()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-costruttore.xml");
		
		FatturaService fattura = context.getBean("fattura", FatturaService.class);
		
		System.out.println(fattura.stampaFattura());
	}
	
	public static void depensOnBean() 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-depends.xml");
		
		BeanA a = context.getBean("beanA", BeanA.class);
		a.saluto();
	}

	public static void lazy()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-lazy.xml");
		
		BeanLazyA a = context.getBean("beanA", BeanLazyA.class);
		a.saluto();
		BeanLazyB b = context.getBean("beanB", BeanLazyB.class);
		b.saluto();
	}
	
	public static void autowire()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-autowire.xml");
		BeanAutoB b = context.getBean("autoB", BeanAutoB.class);
		BeanAutoD d = context.getBean("autoD",BeanAutoD.class);
		BeanAutoE e = context.getBean("autoE",BeanAutoE.class);
		System.out.println(b.saluto());
		System.out.println(d.saluto());
		System.out.println(e.saluto());
	}
	
	public static void scope()
	{
		ApplicationContext context = new  ClassPathXmlApplicationContext("beans-scope.xml");
		BeanSingleton b = context.getBean("signleton", BeanSingleton.class);
		b.setMessaggio("ciao sono io");
		System.out.println(b.saluto());
		
		BeanSingleton b1 = context.getBean("signleton", BeanSingleton.class);	
		System.out.println(b1.saluto());
		
		
		BeanPrototype p = context.getBean("beanPrototype", BeanPrototype.class);
		p.setMessaggio("ciao sono prototype");
		System.out.println(p.saluto());
		
		BeanPrototype p1 = context.getBean("beanPrototype", BeanPrototype.class);;
		System.out.println(p1.saluto());
	}
	
	public static void property()
	{
		ApplicationContext context = new  ClassPathXmlApplicationContext("beans-property.xml");
		BeanProperty prop = context.getBean("prop", BeanProperty.class);
		prop.saluto();
		//PropertySourcesPlaceholderConfigurer
	}
	
	public static void propertyContext()
	{
		ApplicationContext context = new  ClassPathXmlApplicationContext("beans-property-context.xml");
		BeanProperty prop = context.getBean("prop", BeanProperty.class);
		prop.saluto();
		//PropertySourcesPlaceholderConfigurer
	}
	
	
	public static void annotation()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotations.xml");
		BeanAnnotation b = context.getBean("beanAnnotation", BeanAnnotation.class);
		b.saluto();
	}
	
	public static void annotation2()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-annotations.xml");
//		BeanAnnotation b = context.getBean("beanAnnotation", BeanAnnotation.class);
//		b.saluto();
		
		it.test.corsospring.autowire.OrdineService os = context.getBean("ordine", it.test.corsospring.autowire.OrdineService.class);
		
		System.out.println(os.getOrdineInfo());
		
		
		//distuzione di un bean
		BeanDefinitionRegistry registry = (BeanDefinitionRegistry) context.getAutowireCapableBeanFactory();
		registry.removeBeanDefinition("ordine");
		
		
	}
}

package it.test.corsospring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//questo è un aspect
@Aspect
public class Logger
{
	
	//Pointcut è una espressione che definisce le regole con cui associare un determinato evento
	//this su classe proxy
	//target per invocare un advice
	//args uanto il metodo contiene un tipo specificato
	//bean per invocare un advice solo su particolare bean
	
	
	//metodo advise, nella parantesi va il pointcat
	@Before(value = "execution  (* it.test.corsospring.aop.bean.OrdineService.getOrdine())")
	public void logBefore()
	{
		System.out.println("advise - inizio esecuzione ");
	}
	
	
	//metodo advise
	@After(value = "within(it.test.corsospring.aop.bean..*)")
	public void logAfter()
	{
		System.out.println("advise - fine esecuzione");
		
	}

}

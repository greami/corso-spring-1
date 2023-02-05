package it.test.corsospring;

import org.springframework.stereotype.Component;

@Component(value = "beanAnnotation")
public class BeanAnnotation
{
	
	public void saluto()
	{
		System.out.println("ciao sono un Bean con annotation");
	}

}

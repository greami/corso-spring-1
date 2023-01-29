package it.test.corsospring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
	@Bean(name = "ordineAnnotation")
	public OrdineService getOrdineService ()
	{
		
		return new OrdineService();
	}

}

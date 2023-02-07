package it.test.corsospring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import it.test.corsospring.aop.bean.OrdineService;
import it.test.corsospring.aop.bean.ProdottoService;

@Configuration
@EnableAspectJAutoProxy 
public class AppConfig
{
	@Bean(name = "logger")
	public Logger getLogger()
	{
		return new Logger();
	}
	
	@Bean(name = "prodottoService")
	public ProdottoService getProdottoService()
	{
		return new ProdottoService();
	}
	
	@Bean(name = "ordineService")
	public OrdineService getOrdineService()
	{
		return new OrdineService();
	}

}

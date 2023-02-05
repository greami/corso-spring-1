package it.test.corsospring.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig
{
	
	@Bean(name = "phoneBean")
	@Scope("prototype")
	@Description("test of my description")
	public Phone getPhone()
	{
		return new Phone();
	}
	
	@Bean(name = "userBean", initMethod = "init", destroyMethod = "destroy" )
	public User getUser()
	{
		return new User(getPhone());
	}
	
	
	

}

package it.test.corsospring.autowire;

import org.springframework.stereotype.Component;

@Component(value = "cliente")
public class ClienteService
{

	public String getClienteInfo()
	{
		return "amith Greca";
	}
}

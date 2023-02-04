package it.test.corsospring;

import java.util.Date;

public class ProdottoService
{
	
	
	
	public String getProdotto()
	{
		return "Teleefono " + new Date().getTime();
	}
	
	
	public void clean()
	{
		System.out.println("sono in clean");
	}

	
	public String[] getListprodotti()
	{
		return new String [] {"prod1", "prod2", "prod3"};
	}
}

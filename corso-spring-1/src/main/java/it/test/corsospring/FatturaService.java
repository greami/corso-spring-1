package it.test.corsospring;

import java.beans.ConstructorProperties;

public class FatturaService
{

	private OrdineService ordine;
	private ClienteService cliente;
	private String numeroFattura;
	
	
	
	//@ConstructorProperties("numeroFAttura", "mese");
	
	
	//costruttore - utilizza in contructor injection
	public FatturaService(OrdineService ordine, ClienteService cliente)
	{
		super();
		this.ordine = ordine;
		this.cliente = cliente;
	}




	public String stampaFattura()
	{
		this.numeroFattura= "abc";
		return this.numeroFattura + " " + cliente.getHelloMessage() 
				+ " " + ordine.listaProdotti();
	}
	
}

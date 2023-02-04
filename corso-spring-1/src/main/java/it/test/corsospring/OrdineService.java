package it.test.corsospring;

public class OrdineService
{
	private ProdottoService prodotto;
	private ClienteService cliente;
	
	
	
	
	public ClienteService getCliente()
	{
		return cliente;
	}

	public void setCliente(ClienteService cliente)
	{
		this.cliente = cliente;
	}

	public void init()
	{
		System.out.println("sono in itin");
	}
	
	public String hello()
	{
		return "hello!"; 
	}
	
	public void clean()
	{
		System.out.println("sono in clean");
	}
	
		
	
	public ProdottoService getProdotto()
	{
		return prodotto;
	}

	public void setProdotto(ProdottoService prodotto)
	{
		this.prodotto = prodotto;
	}

	public String[] listaProdotti()
	{
		return prodotto.getListprodotti();
	}
	
	
}

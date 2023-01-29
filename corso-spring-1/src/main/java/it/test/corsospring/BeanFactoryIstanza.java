package it.test.corsospring;

public class BeanFactoryIstanza
{
	//in questa classe i metodi non sono statici
	
	private  OrdineService ordine = new OrdineService();
	private  ProdottoService prodotto = new ProdottoService();
	
	
	 public  OrdineService getOrdine()
	{
		return ordine;
	}
	public  ProdottoService getProdotto()
	{
		return prodotto;
	}

}

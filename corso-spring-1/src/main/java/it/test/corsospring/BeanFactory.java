package it.test.corsospring;

public class BeanFactory
{
	
	
	private static OrdineService ordine = new OrdineService();
	private static ProdottoService prodotto = new ProdottoService();
	
	
	 public static OrdineService getOrdine()
	{
		return ordine;
	}
	public static ProdottoService getProdotto()
	{
		return prodotto;
	}

	
	
}

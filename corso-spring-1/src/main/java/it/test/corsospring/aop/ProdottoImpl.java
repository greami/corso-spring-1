package it.test.corsospring.aop;

import java.util.ArrayList;
import java.util.List;

public class ProdottoImpl implements Prodotto
{

	@Override
	public String getProdotto()
	{
		// TODO Auto-generated method stub
		return "smartphone";
	}

	@Override
	public List<String> getProdotti()
	{
		List<String> prod = new ArrayList<String>();
		prod.add("TV");
		prod.add("Penne");
		// TODO Auto-generated method stub
		return null;
	}

}

package it.test.corsospring;

public class BeanAutoE
{

	private BeanAutoC bean;
	
	
	
	public BeanAutoE(BeanAutoC bean)
	{
		super();
		this.bean = bean;
	}



	public String saluto()
	{
		return "ciao sono il BeanAutoE " + bean.saluto();
	}


	
}

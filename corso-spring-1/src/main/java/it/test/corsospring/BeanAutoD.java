package it.test.corsospring;

public class BeanAutoD
{
	private BeanAutoC bean;
	
	public String saluto()
	{
		return "ciao sono il BeanAutoD " + bean.saluto();
	}

	public BeanAutoC getBean()
	{
		return bean;
	}

	public void setBean(BeanAutoC bean)
	{
		this.bean = bean;
	}
	
	

}

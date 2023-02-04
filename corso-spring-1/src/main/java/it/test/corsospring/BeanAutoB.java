package it.test.corsospring;

public class BeanAutoB
{
	
	private BeanAutoA autoA;
	private BeanAutoC autoC;
	
	public String saluto()
	{
		return "ciao sono il BeanAutoB  " + autoA.saluto()  + " " + autoC.saluto();
	}


	public BeanAutoA getAutoA()
	{
		return autoA;
	}


	public void setAutoA(BeanAutoA autoA)
	{
		this.autoA = autoA;
	}


	public BeanAutoC getAutoC()
	{
		return autoC;
	}


	public void setAutoC(BeanAutoC autoC)
	{
		this.autoC = autoC;
	}
	
	


}

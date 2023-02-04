package it.test.corsospring;

public class BeanSingleton
{
	
	private String messaggio;
	
	
	
	public String getMessaggio()
	{
		return messaggio;
	}



	public void setMessaggio(String messaggio)
	{
		this.messaggio = messaggio;
	}



	public String saluto()
	{
		return messaggio;
	}
	

}

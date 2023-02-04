package it.test.corsospring;

public class BeanPrototype
{
	
	private String messaggio = "hello!";
	
	
	
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

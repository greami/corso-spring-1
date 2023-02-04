package it.test.corsospring;

public class BeanProperty
{	
	private String message;
		
	

	public String getMessage()
	{
		return message;
	}



	public void setMessage(String message)
	{
		this.message = message;
	}



	public void saluto()
	{
		System.out.println(message);
	}
	
	
	
}

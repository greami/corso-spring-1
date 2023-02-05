package it.test.corsospring.annotation;

public class User
{
	private Phone phone;

	public User(Phone phone)
	{
		super();
		this.phone = phone;
	}



	public String getUserInfo()
	{
		return "amith Greca " + phone.getPhone();
	}
	
	
	public void init()
	{
		System.out.println("sono in init");
	}
	
	public void destroy()
	{
		System.out.println("sono in destroy");
	}


}


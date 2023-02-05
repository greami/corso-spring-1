package it.test.corsospring.annotation.scan;


import org.springframework.stereotype.Component;

@Component(value = "role")
public class Role
{
	public String getRole()
	{
		return "admin";
	}

}

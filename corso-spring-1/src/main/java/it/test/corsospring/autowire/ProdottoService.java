package it.test.corsospring.autowire;

import java.util.Date;

import javax.annotation.ManagedBean;
import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component(value = "prodotto")
//@Named //JAVA ENTRERPISE NOTATION
//@ManagedBean //JAVA ENTRERPISE NOTATION
public class ProdottoService
{
	
	
	public String getProdotto()
	{
		return "Prod " + new Date().getTime();
		
	}

}

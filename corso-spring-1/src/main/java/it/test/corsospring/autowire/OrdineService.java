package it.test.corsospring.autowire;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "ordine")
public class OrdineService
{

	@Resource(name = "cliente") // NOTATION JAVAX 
	private ClienteService cliente;
	
//	@Inject   //notation JAVA ENTERPRISE
//	private ClienteService cliente;
	
	@Autowired  //autowire su variabile m non necessario seeetter o costruttore notation SPRING
	private ProdottoService prodotto;
	
	
	// autowire : COSTRUTTORE
//	public OrdineService()
//	{
//	}
//
//	@Autowired
//	public OrdineService(ClienteService cliente)
//	{
//		super();
//		this.cliente = cliente;
//	}

	//autowire SETTER
//	@Autowired
//	public void setCliente(ClienteService cliente)
//	{
//		this.cliente = cliente;
//	}

	//autowire: METODO
//	@Autowired
//	public void recuperServices(ClienteService clienteService, ProdottoService prodotto)
//	{
//		this.cliente = clienteService;
//		this.prodotto = prodotto;
//	}

	public String getOrdineInfo()
	{
		String data = new Date().toString();
		String infoCliente = cliente.getClienteInfo();
		
		return data + " " + infoCliente + " | " +  prodotto.getProdotto();
	}


	public ClienteService getCliente()
	{
		return cliente;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init di OrdineSerive bean, prima dell'istanziazione del bean");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy di OrdineSerive bean");
	}

}

package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;


public class ClientController {
	ClientService  clientService ;
	
	public ClientService getClientService() {
		return clientService;
		
	}
	
	

	

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}





	public ClientController() {
		System.out.println("Call ClientController ...");
	}
	
	

	public Client save(Client c ){
		System.out.println("ClientController level...");
		return clientService.save(c);
		}

	public ClientController(ClientService clientService) {
		
		
		
		this.clientService = clientService;
	}

	
	
	


}

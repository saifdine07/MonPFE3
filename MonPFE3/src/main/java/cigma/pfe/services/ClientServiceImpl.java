package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;

public class ClientServiceImpl implements ClientService {
	
	ClientRepository clientRepository ;
	
	

	

	public void setClientRepository(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	public ClientServiceImpl() {
		System.out.println("Call ClientServieImpl");
	}

	@Override
	public Client save(Client c) {
		System.out.println("Service Layer : ClientServiceImpl Level... ");
		return  clientRepository.save(c);
		
	}

}

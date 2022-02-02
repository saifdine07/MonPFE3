package cigma.pfe.repositories;

import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository {

	public ClientRepositoryImpl() {
		System.out.println("Call ClientRepositoryImpl...");
	}
	
			
	@Override
	public Client save(Client c) {
		// TODO Auto-generated method stub
		System.out.println("DAO Layer : ClientRepositoryImpl Level");
		
		return  null;
	}

}

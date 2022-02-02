package cigma.pfee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;

public class MonApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//ClientRepository rep = (ClientRepository) context.getBean("idDao");
		ClientController ctrl = (ClientController) context.getBean("idCtrl");
		
		
		 
		
		Client client1 = new Client(1, "saif");
		
		ctrl.save(client1);
		
		
		
	
		
		
		

	}

}

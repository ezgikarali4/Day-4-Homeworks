package day4Homework1;

import java.rmi.RemoteException;
import day4Homework1.ICustomerCheckService;
import day4Homework1.Customer;
import mernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result =false;

		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		} catch (RemoteException e) {
			System.out.println("Not a valid person");
		}
		return result;
	}

}

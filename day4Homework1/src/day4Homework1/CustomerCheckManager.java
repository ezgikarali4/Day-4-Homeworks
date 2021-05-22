package day4Homework1;

import day4Homework1.ICustomerCheckService;
import day4Homework1.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;		
	}

	

}

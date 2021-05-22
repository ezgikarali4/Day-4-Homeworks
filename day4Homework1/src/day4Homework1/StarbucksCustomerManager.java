package day4Homework1;

import day4Homework1.ICustomerCheckService;
import day4Homework1.Customer;

public class StarbucksCustomerManager extends CustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void add(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.add(customer);

		}else {
			System.out.println("Not a valid person.");
		}
		
	}

	

	

}

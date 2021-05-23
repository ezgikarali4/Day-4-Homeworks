package day4Homework2;

import day4Homework2.ICustomerCheckService;
import day4Homework2.Customer;

public class SteamCustomerManager extends CustomerManager {
	
	private ICustomerCheckService customerCheckService;
	private SaleGames game;
	
	public SteamCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void add(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.add(customer);
			System.out.println("Successfully registered to Steam.");

		}else {
			System.out.println("Not a valid person.");
		}
		
	}
	
	
}

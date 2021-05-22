package day4Homework1;

import day4Homework1.ICustomerService;
import day4Homework1.Customer;


public class CustomerManager implements ICustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName());		
	}

}

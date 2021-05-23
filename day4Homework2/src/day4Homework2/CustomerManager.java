package day4Homework2;

public class CustomerManager implements ICustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName());		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Informations updated : " + customer.getFirstName());		

	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Deleted from database : " + customer.getFirstName());		

	}

	

	

	
}

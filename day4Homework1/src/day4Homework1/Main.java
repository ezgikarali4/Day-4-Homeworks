package day4Homework1;

import day4Homework1.MernisServiceAdapter;
import day4Homework1.CustomerManager;
import day4Homework1.StarbucksCustomerManager;
import day4Homework1.Customer;
import day4Homework1.NeroCustomerManager;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.add(new Customer(1, "Ezgi", "Karalý", LocalDate.of(2001, 05, 10), "11111111111"));
		
	}

}

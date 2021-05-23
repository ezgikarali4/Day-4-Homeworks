package day4Homework2;

import day4Homework2.MernisServiceAdapter;
import day4Homework2.CustomerManager;
import day4Homework2.SteamCustomerManager;
import day4Homework2.Customer;
import day4Homework2.SaleGames;
import day4Homework2.CustomerCheckManager;
import day4Homework2.SteamCampaign;
import day4Homework2.SteamCampaignManager;

import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "Ezgi", "Karalý", LocalDate.of(2001, 05, 10), "11111111111");
		
		CustomerManager customerManager = new SteamCustomerManager(new MernisServiceAdapter());
		customerManager.add(customer);
		
		SaleGames game = new SaleGames("The Witcher", 100, 1000, 75, 25);
		game.add();
		
		SteamCampaignManager campaign = new SteamCampaignManager(new MernisServiceAdapter());
		campaign.CampaignAdd(game, customer);
		
		
		
		
		

	}
}

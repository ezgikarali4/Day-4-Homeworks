package day4Homework2;
import day4Homework2.ICustomerCheckService;
import day4Homework2.Customer;
import day4Homework2.SaleGames;
import day4Homework2.SteamCampaign;
import day4Homework2.Customer;
import day4Homework2.CustomerCheckManager;

public class SteamCampaignManager implements ICampaignManager{

	
	private ICustomerCheckService customerCheckService;
	
	
	
	public SteamCampaignManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	

	@Override
	public void CampaignAdd(SaleGames saleGames, Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Campaign price of " + saleGames.getGameName() + " : " + saleGames.getGamePriceAferDiscount());

		}else {
			
			System.out.println("Normal price of " + saleGames.getGameName() + " : " + saleGames.getGamePrice());
		}
	}


	
	@Override
	public void CampaignDelete(SaleGames saleGames, Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CampaignUpdate(SaleGames saleGames, Customer customer) {
		// TODO Auto-generated method stub
		
	}


}

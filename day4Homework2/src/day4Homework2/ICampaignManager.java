package day4Homework2;
import day4Homework2.SteamCampaign;
import day4Homework2.Customer;
import day4Homework2.SaleGames;
 

public interface ICampaignManager {
	void CampaignAdd(SaleGames saleGames, Customer customer);
	
	void CampaignDelete(SaleGames saleGames, Customer customer);
	
	void CampaignUpdate(SaleGames saleGames, Customer customer);
}

package day4Homework2;

public class SteamCampaign {

	public int id;
	public String Name;
	public int price;

	
	public SteamCampaign(int id, String Name, int price){
		this.id = id;
		this.Name = Name;
		this.price = price;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}

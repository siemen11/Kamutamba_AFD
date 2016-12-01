package POS;

public class Shop {
	//variables
	String Name_ID;
	Stock stock;
	
	
	//setter getters
	
	public Stock getStock() {
		return stock;
	}


	private void setStock(Stock stock) {
		this.stock = stock;
	}


	public String getName_ID() {
		return Name_ID;
	}


	private void setName_ID(String name_ID) {
		Name_ID = name_ID;
	}

	//general
	
	public Shop(String Name){
		setName_ID(Name);
		setStock(new Stock());
		
	}

}

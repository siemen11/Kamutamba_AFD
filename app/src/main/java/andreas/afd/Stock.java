package POS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {
	//VARIABLES
	
	List<StockItem> stockItems ;
	//dictionary for item amount
	Map<StockItem, Integer> stockItemAmount;
	Map<String, StockItem> stockItemByName;
	
	//SETTERS && GETTERS
	
	


	public Map<String, StockItem> getStockItemByName() {
		return stockItemByName;
	}


	public void setStockItemByName(Map<String, StockItem> stockItemByName) {
		this.stockItemByName = stockItemByName;
	}


	public void setStockItems(List<StockItem> stockItems) {
		this.stockItems = stockItems;
	}
	public List<StockItem> getStockItems() {
		return stockItems;
	}


	public Map<StockItem, Integer> getStockItemAmount() {
		return stockItemAmount;
	}


	private void setStockItemAmount(Map<StockItem, Integer> map) {
		this.stockItemAmount = map;
	}
	

	//GENERAL
	public Stock() {
		setStockItems(new ArrayList<StockItem>());
		setStockItemAmount(new HashMap<StockItem, Integer>());
	}
	
	public void addStockItem(String nameItem, float buy_price, float sell_price){
		getStockItemByName().put(nameItem, new StockItem(nameItem, buy_price, sell_price));
		stockItems.add(getStockItem(nameItem));
		getStockItemAmount().put(getStockItem(nameItem), 0);
	}
	public void removeStockItem(String nameItem){
		//what if still amount in stock ?
		getStockItemByName().remove(nameItem);
		stockItems.remove(getStockItem(nameItem));
		getStockItemAmount().remove(getStockItem(nameItem));
	}
	
	public StockItem getStockItem(String nameItem){
		return getStockItemByName().get(nameItem);
	}
	
	public void changeAmountItem(String name , int amount){
		 getStockItemAmount().put(getStockItem(name), amount);
	}
	
	
	
}

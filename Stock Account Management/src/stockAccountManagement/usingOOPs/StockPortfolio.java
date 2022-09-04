package stockAccountManagement.usingOOPs;

import java.util.ArrayList;

public class StockPortfolio {
	
	ArrayList<Stock> listOfStocks = new ArrayList<>();

	public StockPortfolio(ArrayList<Stock> listOfStocks) {
		this.listOfStocks = listOfStocks;
	}

	public StockPortfolio() {
		super();
	}

	@Override
	public String toString() {
		return "StockPortfolio [listOfStocks=" + listOfStocks + "]";
	}
	
	public void addToPortfolio(Stock stock) {
		this.listOfStocks.add(stock);
	}
	
	public void displayPortfoliio() {
		System.out.println("\nDisplaying Stock Portfolio...\n");
		System.out.println("STOCK\tVALUE\tSHARES\tPRICE");
		for(Stock stockToPrint : this.listOfStocks) {
			System.out.println(stockToPrint.getName() + "\t" + stockToPrint.getValue() + "\t" + stockToPrint.getNumberOfShares() + "\t" + stockToPrint.getSharePrice());
		}
	}
	
	public void displayStockReport() {
		System.out.println("\n\nSTOCK REPORT");
		displayPortfoliio();
		System.out.println("\n\nTotal Stock Value : $" + calculateTotalValue());
	}
	
	public int calculateTotalValue() {
		int totalValue = 0;
		for(Stock stock : this.listOfStocks) {
			totalValue += stock.getValue();
		}
		return totalValue;
	}

}

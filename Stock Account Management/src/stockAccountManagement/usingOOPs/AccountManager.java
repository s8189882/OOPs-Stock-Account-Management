package stockAccountManagement.usingOOPs;

/*Write a program to read in Stock Names, Number of Share, Share Price. 
Print a Stock Report with the total value of each Stock and 
the total value of Stock.
*/

public class AccountManager {

	public static void main(String[] args) {
		System.out.println("Welcome to the Stock Account Management Program!");
		
		Stock stockObj = new Stock();
		StockPortfolio portfolio = new StockPortfolio();
		stockObj.addStocks(portfolio);
		portfolio.displayStockReport();;
	}
}

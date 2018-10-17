import java.util.Scanner;

/**
 * @EBRILLO03
 */

public class Stock {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please Enter Number of Shares:   ");
	Double shares = scan.nextDouble();
	
	System.out.println("Price Paid Per Share:   ");
	Double pricepaidpershare = scan.nextDouble();
	
	System.out.println("Commision Rate Pay for the purchase of the Stock Broker (i.e. .06):   ");
	Double commisionratepurchaseofbroker = scan.nextDouble();
	
	System.out.println("Price Per Share That the Stocks were Sold For:   ");
	Double pricepershare = scan.nextDouble();
	
	System.out.println("Commision Rate for the Stock  Broker( i.e. .06):  ");
	Double commisionrateforbroker = scan.nextDouble();
	
	Double moneyonstocks = shares*pricepaidpershare;
	System.out.println("Amount of Money paid for Stocks:   " + moneyonstocks );
	
	Double moneypaidincommision = moneyonstocks*commisionratepurchaseofbroker;
	System.out.println("Amount of Money Paid in Commission:   ");
	
	Double totalsaleprice = moneypaidincommision+moneyonstocks;
	System.out.println("Total Sale Price:   ");
	
	
	}
	}



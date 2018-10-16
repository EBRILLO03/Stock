import java.util.Scanner;

/**
 * @EBRILLO03
 */

public class Stock {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please Enter Number of Shares:   ");
	String sharesStr = scan.nextLine();
	int shares = Integer.parseInt(sharesStr);
	
	System.out.println("Price Paid Per Share:   ");
	Double pricepaidpershare = scan.nextDouble();
	
	System.out.println("Commision Rate Pay for the purchase of the Stock Broker (i.e. .06):   ");
	Double commisionratepurchaseofbroker = scan.nextDouble();
	
	System.out.println("Price Per Share That the Stocks were Sold For:   ");
	Double pricepershare = scan.nextDouble();
	
	System.out.println("Commision Rate for the Stock  Broker:  ");
	Double commisionrateforbroker = scan.nextDouble();
	
	System.out.print("Amount of Money paid for Stocks:   " + sharesStr*pricepaidforshare );
	
	}
	}



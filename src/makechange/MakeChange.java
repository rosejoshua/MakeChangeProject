package makechange;

import java.util.Scanner;

public class MakeChange {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		purchPrompt();		
	}
	
	public static void purchPrompt() {
		System.out.println("Enter price of item: ");
		double price = input.nextDouble();
		input.nextLine();
		
		System.out.println("Enter amount paid: ");
		double paid = input.nextDouble();
		input.nextLine();
		
		if (price == paid) {
			System.out.println("Transaction complete. No change required.");
		}
		else if (price > paid) {
			System.out.println("Not enough paid, try again: ");
			purchPrompt();
		}
		else if (price < paid) {
			getChange(price, paid);
		}
	}
	
	public static void getChange(double price, double paid) {
				
		int centsPrice = (int)(price*100);
		System.out.println(centsPrice);
		int centsPaid = (int)(paid*100);
		System.out.println(centsPaid);
		int change = centsPaid - centsPrice;
		System.out.println(change);
		
		System.out.print("Change to be given is $" + (change/100) + ".");
		System.out.printf("%02d", (change%100));
		System.out.println(" in the following denominations:");
		
		if (change>=2000) {
			int numOfTwenty = change/2000;
			change = change % 2000;
			System.out.print("(" + numOfTwenty + ")" + " 20 dollar bill");
			if (numOfTwenty > 1) {System.out.print("s");
			System.out.println();
			}
		}
	}

}

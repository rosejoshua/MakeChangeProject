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
//			getchange(String price, String paid);
		}
	}

}

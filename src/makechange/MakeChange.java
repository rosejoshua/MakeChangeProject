package makechange;

import java.util.Scanner;

public class MakeChange {
	static Scanner input = new Scanner(System.in);

	//calls purchPrompt(), if change calculation is needed, purchase prompt will call getChange().
	public static void main(String[] args) {
		purchPrompt();
	}

	//Takes user input for cost and payment, checks to see if enough money has been provided to cover transaction.
	//If cost == payment, will print message saying transaction is complete. If not enough money is provided, will
	//call on itself to restart prompts. Once a valid set of inputs requiring change are entered, calls getChange()
	//and passes double values of price and amount paid.
	public static void purchPrompt() {
		System.out.print("Enter price of item: ");
		double price = input.nextDouble();
		input.nextLine();

		System.out.print("Enter amount paid: ");
		double paid = input.nextDouble();
		input.nextLine();

		if (price == paid) {
			System.out.println("Transaction complete. No change required.");
		} else if (price > paid) {
			System.out.println("Not enough paid, try again: ");
			purchPrompt();
		} else if (price < paid) {
			getChange(price, paid);
		}
	}

	//Takes doubles representing dollars from purchPrompt, converts them to cents and casts them to ints for integer division.
	//Uses integer division and fall through to convert total cents change into denominations of bills and coins, updating
	//remaining change as bills and coin amounts are printed.
	public static void getChange(double price, double paid) {

		int centsPrice = (int) (price * 100); //converts price into a penny amount
		int centsPaid = (int) (paid * 100); //converts paid into a penny amount
		int change = centsPaid - centsPrice; //determines change to be paid in pennies

		System.out.print("Change to be given is $" + (change / 100) + "."); //integer division to print number of dollars in change plus decimal
		System.out.printf("%02d", (change % 100)); //determine amount to be printed on right side of decimal, using printf so empty tenths/ones aren't lost
		System.out.println(" in the following denominations:");

		//The following "if" blocks use integer division to determine number of each denomination to return as change. 
		//% operator is used to update change after denominations are formed and lets change fall through to next "if" block
		if (change >= 2000) {
			int numOfTwenty = change / 2000;
			change = change % 2000;

			System.out.print("(" + numOfTwenty + ")" + " 20 dollar bill");
			if (numOfTwenty > 1) {
				System.out.print("s");
			}
			System.out.println();
		}

		if (change >= 1000) {
			int numOfTen = change / 1000;
			change = change % 1000;

			System.out.print("(" + numOfTen + ")" + " 10 dollar bill");
			if (numOfTen > 1) {
				System.out.print("s");				
			}
			System.out.println();
		}

		if (change >= 500) {
			int numOfFive = change / 500;
			change = change % 500;

			System.out.print("(" + numOfFive + ")" + " 5 dollar bill");
			if (numOfFive > 1) {
				System.out.print("s");
			}
			System.out.println();
		}

		if (change >= 100) {
			int numOfOne = change / 100;
			change = change % 100;

			System.out.print("(" + numOfOne + ")" + " 1 dollar bill");
			if (numOfOne > 1) {
				System.out.print("s");
			}
			System.out.println();
		}

		if (change >= 25) {
			int numOfQuarter = change / 25;
			change = change % 25;

			System.out.print("(" + numOfQuarter + ")" + " quarter");
			if (numOfQuarter > 1) {
				System.out.print("s");
			}
			System.out.println();
		}

		if (change >= 10) {
			int numOfDime = change / 10;
			change = change % 10;

			System.out.print("(" + numOfDime + ")" + " dime");
			if (numOfDime > 1) {
				System.out.print("s");
			}
			System.out.println();
		}

		if (change >= 5) {
			int numOfNickel = change / 5;
			change = change % 5;

			System.out.print("(" + numOfNickel + ")" + " nickel");
			if (numOfNickel > 1) {
				System.out.print("s");
			}
			System.out.println();
		}

		if (change >= 1) {
			int numOfPenny = change;
			change = change % 1;

			if (numOfPenny > 1) {
				System.out.print("(" + numOfPenny + ")" + " pennies");
			} 
			if (numOfPenny ==1) {
				System.out.print("(" + numOfPenny + ")" + " penny");
			}
			
			System.out.println();
		}

	}
	
}

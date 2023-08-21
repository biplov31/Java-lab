import java.util.Scanner;

public class ATM{
	static String cardNumber = "5678";	
	static String username = "Ram Bahadur";
	static int userBalance = 5000;
		
	static void displayBalance(int currentBalance){
		System.out.println("Your current balance is " + currentBalance);
	}
	
	static void withdrawCash(int currentBalance, int withdrawAmount){
		if(withdrawAmount > currentBalance){
			System.out.println("Insufficient balance.");
		} else {
			System.out.println("You have successfully withdrawn " + withdrawAmount + ". Your remaining balance is " + (currentBalance-withdrawAmount));
		}
	}
	
	static void balanceTracker(){
		
	}
	
	static void showMinistatement(int currentBalance, String cardNum, int lastWithdrawal){
		// System.out.println("\n--- NEPAL BANK UNLIMITED ---\nUsername: " + username + "\nCard Number: " + cardNumber + "\nTotal Balance: " + currentBalance + "\nLast Transaction: Rs" + lastWithdrawal + " withdrawn.\n");
		System.out.format("%n%-30s%n", "NEPAL BANK UNLIMITED");
		System.out.format("%-15s %15s %n", "Username: ", username);
		System.out.format("%-15s %15s %n", "Card Number: ", cardNumber);
		System.out.format("%-15s %15s %n", "Total Balance: ", currentBalance);
		// System.out.format("%20s %20s", "Last Transaction: ", username);

	}
	
	static void sayThanks(){
		System.out.println("Thank you for using our service.");
	}
	
	static void showMenu(Scanner scan){
		while(true){
			int withdrawalAmt = 0;
			System.out.print("Enter 1 for balance enquiry, 2 for withdrawal, 3 for mini statement, and 0 to exit: ");
			int userChoice = scan.nextInt();
			switch(userChoice){
				case 1:
					displayBalance(userBalance);
					sayThanks();
					break;
				case 2:
					System.out.print("\nEnter the amount you want to withdraw: ");
					withdrawalAmt = scan.nextInt();
					withdrawCash(userBalance, withdrawalAmt);
					userBalance -= withdrawalAmt;
					sayThanks();
					break;
				case 3:
					showMinistatement(userBalance, cardNumber, withdrawalAmt);
					sayThanks();
					break;
				case 0:
					System.out.println("Hope to see you soon.");
					return;
				default:
					System.out.println("Your choice was not valid.");
					
			}
			
			String chYes = "y";
			String chNo = "n";
			System.out.print("Press Y to continue banking and N to exit from the app: ");
			scan.nextLine();
			String finalChoice = scan.nextLine().toLowerCase();
			if(finalChoice.equals(chYes)){
				continue;
			} else {
				System.out.print("See you soon.\n");
				return;
			}
			
		}	
	} 
	
	static boolean pinValidate(int pinNumber){
		if(pinNumber == 1234){
			return true;
		} else {
			System.out.println("Invalid PIN.");
			return false;
		}
	}
	
	static boolean cardValidate(String cardNumber){
		if(cardNumber.equals("5678")){
			return true;
		} else {
			System.out.println("Card is invalid.");
			return false;
		}
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("\n<===  Welcome to our ATM service  ===>\n");
		System.out.print("Enter your card number: ");
		String userCard = scan.nextLine();
		boolean cardIsValid = cardValidate(userCard);
		int pin = 0;
		int counter = 0;
		
		if(cardIsValid){
			do{
				System.out.print("Enter your PIN number: ");
				pin = Integer.parseInt(scan.nextLine());
				counter++;
			} while(!pinValidate(pin) && counter < 3);
			
			if(counter < 3){
				showMenu(scan);
			} else {
				System.out.println("You are out of luck.");
			}
		}
	}
}
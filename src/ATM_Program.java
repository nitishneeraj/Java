import java.util.Scanner;

public class ATM_Program {

	void ATM_Prog() {
		Scanner sc = new Scanner(System.in); // used to get input
		int balance = 100000, withdraw, deposit;
		int option1;
		boolean loop_terminate = true; // flag used to terminate inner while loop

		// Main Menu
		while (true) {
			// Main Menu options
			System.out.println("\nAutomated Teller Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT"); 
			System.out.println("5.Exit main menu");

			System.out.print("Please enter your choice : ");
			option1 = sc.nextInt();

			switch (option1) {

			case 1:
				System.out.print("Enter money to be withdrawn:");
				withdraw = sc.nextInt();
				if (balance > withdraw) {
					balance = balance - withdraw;
					System.out.println("Please collect your money");
				} else {
					System.out.println("Insufficient Balance");
				}
				System.out.println("");
				break;
			case 2:
				System.out.print("Enter money to be deposited:");
				deposit = sc.nextInt();
				balance = balance + deposit;
				System.out.println("Your Money has been successfully depsited");
				System.out.println("");
				break;
			case 3:
				System.out.println("Balance : "+balance);  
		        System.out.println("");  
				break; // never forget to add this break statement
			case 4:
				System.exit(0);  
				break;
			case 5:
				return; // terminate outer menu

			default:
				System.out.println("Invalid option");
			}
		}

	}
}

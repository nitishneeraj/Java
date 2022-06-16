import java.util.Scanner;

public class Number_Programs {
	static Scanner s1 = new Scanner(System.in);
	static Number_Prog_all num = new Number_Prog_all();

	static int scan() {
		int num = s1.nextInt();
		return num;
	}

	public static void main(String[] args) {

		int option1, option2 = 0;
		boolean loop_terminate = true; // flag used to terminate inner while loop

		// Main Menu
		while (true) {
			// Main Menu options
			System.out.println("\n1.Reverse a Number");
			System.out.println("2.Option 2");
			System.out.println("3.Option 3");
			System.out.println("4.Option 4");
			System.out.println("5.Exit main menu");

			System.out.print("Please enter your choice : ");
			option1 = s1.nextInt();

			switch (option1) {

			case 1: {
				num.Reverse();
				break;
			}
			case 2:
				// do something here
				break;
			case 3: {
				
				break; // never forget to add this break statement
			}
			case 4:
				break;
			case 5:
				return; // terminate outer menu

			default:
				System.out.println("Invalid option");
			}
		}

	}
}

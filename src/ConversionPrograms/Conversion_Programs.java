package ConversionPrograms;

import java.util.Scanner;

public class Conversion_Programs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // used to get input
		int option1, option2 = 0;
		boolean loop_terminate = true; // flag used to terminate inner while loop

		// Main Menu
		while (true) {
			// Main Menu options
			System.out.println("\n1.Convert String to int");
			System.out.println("2.Convert int to String");
			System.out.println("3.");
			System.out.println("4.");
			System.out.println("5.Exit main menu");

			System.out.print("Please enter your choice : ");
			System.out.println();
			option1 = input.nextInt();

			switch (option1) {

			case 1:
				String_to_int S_int = new String_to_int();
				S_int.StringInt();
				S_int.StringInt1();
				S_int.Exception();
				break;
			case 2:
				Int_to_String str = new Int_to_String();
				str.IntString();
				str.IntString1();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 0:
				return; // terminate outer menu

			default:
				System.out.println("Invalid option");
			}
		}

	}

}

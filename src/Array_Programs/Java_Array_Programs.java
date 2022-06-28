package Array_Programs;

import java.util.Scanner;

public class Java_Array_Programs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int option1;
		boolean loop_terminate = true;
		while (true) {
			System.out.println("\n1.Copy all elements of one array into another array");
			System.out.println("2.Option 2");
			System.out.println("3.Option 3");
			System.out.println("4.Option 4");
			System.out.println("0.Exit main menu");

			System.out.print("Please enter your choice : ");
			option1 = input.nextInt();

			switch (option1) {

			case 1:
				Copy_all_elements C_Array = new Copy_all_elements();
				C_Array.CopyElements();
				break;
			case 2:
				// do something here
				break;
			case 3:

				break; // never forget to add this break statement
			case 4:
				break;
			case 0:
				return; // terminate outer menu

			default:
				System.out.println("Invalid option");
			}
		}
	}

}

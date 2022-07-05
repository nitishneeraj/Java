import java.util.Scanner;

public class Test_Program {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // used to get input
		int option1, option2 = 0;
		boolean loop_terminate = true; // flag used to terminate inner while loop

		// Main Menu
		while (true) {
			// Main Menu options
			System.out.println("1.Option 1");
			System.out.println("2.Option 2");
			System.out.println("3.Option 3");
			System.out.println("4.Option 4");
			System.out.println("5.Exit main menu");

			System.out.print("Please enter your choice : ");
			option1 = input.nextInt();

			switch (option1) {

			case 1:
				// do somethin	g here
				break;
			case 2:
				// do something here
				break;
			case 3:
				loop_terminate = true;

				while (loop_terminate) {
					// Inner menu options
					System.out.println("1.Inner Menu option 1");
					System.out.println("2.Inner Menu option 2");
					System.out.println("3.Inner Menu option 3");
					System.out.println("4.Return to Main Menu");

					System.out.print("Please enter your choice : ");
					option2 = input.nextInt();
					switch (option2) {

					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						loop_terminate = false; // this will terminate inner menu
						break;
					default:
						System.out.println("Invalid option");
						break;
					}
				}
				break; // never forget to add this break statement
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

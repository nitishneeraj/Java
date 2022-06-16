import java.util.Scanner;

public class Number_Prog_all {

	Number_Programs n1 = new Number_Programs();

	public void Reverse_using_while_loop() {
		System.out.print("\nEnter Number we want to reverse: ");
		int num = n1.scan();
		int rev = 0;
		while (num != 0) {
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The reverse of the given number is: " + rev); 
	}
	
	
	
	
	public void Reverse () {
			Scanner input = new Scanner(System.in); // used to get input
			int option1, option2 = 0;
			boolean loop_terminate = true; // flag used to terminate inner while loop

			// Main Menu
			while (true) {
				// Main Menu options
				System.out.println("\n1.Reverse a number using while loop ");
				System.out.println("2.Reverse a number using for loop");
				System.out.println("3.Reverse a number using recursion");
				System.out.println("4.Return to Main Menu");

				System.out.print("Please enter your choice : ");
				option1 = input.nextInt();

				switch (option1) {

				case 1:
					Reverse_using_while_loop();
					break;
				case 2:
					// do something here
					break;
				case 3:
					break; // never forget to add this break statement
			
				case 4:
					return; // terminate outer menu

				default:
					System.out.println("Invalid option");
				}
			}
			
		
	}

}

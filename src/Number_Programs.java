import java.util.Scanner;

public class Number_Programs {
	static Scanner s1 = new Scanner(System.in);
	static Number_Prog_Reverse num = new Number_Prog_Reverse();
	static Number_to_Word num1  = new Number_to_Word();
	static Number_programs_others  num_oth = new Number_programs_others();

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
			System.out.println("2.Number to Word");
			System.out.println("3.Sum of Natural Numbers");
			System.out.println("4.Display Odd Numbers From 1 to 100");
			System.out.println("5.Display Even Numbers From 1 to 100");
			System.out.println("6.Perfect Square");
			System.out.println("7.Positive or Negative");
			System.out.println("8.Find Smallest of Three Numbers");
			System.out.println("9.Largest of Three Numbers");
			System.out.println("0.Exit main menu");
			

			System.out.print("Please enter your choice : ");
			option1 = s1.nextInt();

			switch (option1) {

			case 1: {
				num.Reverse();
				break;
			}
			case 2:
				num1.Number_To_Word();
				break;
			case 3: {
				num_oth.Sum_of_Natural_Numbers();
				break; // never forget to add this break statement
			}
			case 4:
				num_oth.Display_Odd_Numbers();
				break;
			case 5:
				num_oth.Display_Even_Numbers();
				break;
			case 6:
				System.out.print("\nEnter a number: ");   
				double number=s1.nextDouble();   
				if (num_oth.checkPerfectSquare(number))   
				System.out.println("Yes, the given number is perfect square.");  
				else  
				System.out.print("No, the given number is not perfect square.");    
				break;				
			case 7:
				num_oth.Positive_or_Negative();
				break;
			case 8:
				num_oth.SmallestNumber();
				break;
			case 9:
				num_oth.Largest_of_Three_Numbers();
				break;
			case 0:
				return; // terminate outer menu

			default:
				System.out.println("Invalid option");
			}
		}
	}
}

import java.util.Scanner;

public class Recursion {
	
	
	void printNum(int num) {
		if(num == 0) {
			return;
		}
		System.out.print(num+" ");
		printNum(num-1);
	}
	void printNum1(int num) {
		if(num == 6) {
			return;
		}
		System.out.print(num+" ");
		printNum1(num+1);
	}
	
	void naturalNum(int num, int i, int sum) {//Second parameter base condition kya h
		if (num == i) {
			sum += num;
			System.out.println("Sum: "+sum);
			return;
		}
		sum += num;
		naturalNum(num + 1, i, sum);
		System.out.println(i);
	}
	
	void recursionExample1() {
		Scanner input = new Scanner(System.in); // used to get input
		int option1;
		boolean loop_terminate = true; // flag used to terminate inner while loop

		// Main Menu
		while (true) {
			// Main Menu options
			System.out.println();
			System.out.println("\n1.Print Numbers from 5 to 1");
			System.out.println("2.Print Numbers from 1 to 5");
			System.out.println("3.Sum of the first n natural numbers");
			System.out.println("4.Option 4");
			System.out.println("5.Exit main menu");

			System.out.print("Please enter your choice : ");
			option1 = input.nextInt();

			switch (option1) {

			case 1:
				printNum(5);
				break;
			case 2:
				printNum1(1);
				// do something here
				break;
			case 3:
				naturalNum(1,5,0);
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

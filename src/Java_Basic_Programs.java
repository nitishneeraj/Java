import java.util.Scanner;

public class Java_Basic_Programs {
	static int n1 = 0, n2 = 1, n3, sum = 0, temp, store;

	public static void main(String[] args) {
		// Fibonacci(10);
		// --------------------------------------------------------

		// ----------------called printFibonacci()
		int count = 10;
		// System.out.print(n1 + " " + n2);
		// printFibonacci(count - 2); // n-2 because 2 numbers are already printed
		// ------------------------------------------------------------------

		// ----------- called prime()
		// prime(44);
		/*
		 * Scanner s1 = new Scanner(System.in);
		 * System.out.println("Find no is prime/Enter any number: "); int n =
		 * s1.nextInt(); if (isPrime(n)) { System.out.println(n + " is a prime number");
		 * } else { System.out.println(n + " is not a prime number"); }
		 */

		// ----------Palindrome()
		// Palindrome(454);
		//String_Palindrome();

		// ----------fact()
		 fact(5);

	}

	public static void Fibonacci(int count) {
		// example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < count; i++) { // loop starts from 2 because 0 and 1 are already printed
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	public static void printFibonacci(int count) {
		// Fibonacci series program in java using recursion.
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}

//-----------------------------------------------------------------
	public static void prime(int num) {
		// For example 2, 3, 5, 7, 11, 13, 17....
		int m, flag = 0;
		m = num / 2;
		if (num == 1 || num == 0) {
			System.out.println(num + " is not prime number");
		} else {
			for (int i = 0; i < num; i++) {
				if (num % 2 == 0) {
					System.out.println(num + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " is prime number");
			}
		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
//-----------------------------------------------------------------

	public static void Palindrome(int num) {
		// example 545, 151, 34543, 343, 171, 48984
		temp = num;
		while (num > 0) {
			store = num % 10;
			sum = sum * 10 + store;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome");
		}
	}

	public static void String_Palindrome() {
		// Ex:- example 545, 151, 34543, 343, 171, 48984
		// string like LOL, MADAM
		String original, reverse = ""; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");

	}
// -----------------------------------------------------------------------------

	
	static void fact(int num) {
		int fact=1;
		for (int j = 1; j <= num; j++) {
			fact = fact*j;
		}
		System.out.println("Factorial of "+num+" is: "+fact); 
		
	}
}

import java.util.Scanner;

public class Java_Basic_Programs2 {
	static int n1 = 0, n2 = 1, n3, sum = 0, temp, store;

	static void Fibonacci(int count) {
		// example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < count; i++) { // loop starts from 2 because 0 and 1 are already printed
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println("\n");
	}

	static void R_Fibonacci(int count) {
		// Fibonacci series program in java using recursion.
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			R_Fibonacci(count - 1);
		}
	}

	static int scanner() {
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		return num;
	}

	static void prime(int num) {
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
		System.out.print("\n");
	}

	static boolean isPrime(int num) {
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

	static void fact(int num) {
		int fact = 1;
		for (int j = 1; j <= num; j++) {
			fact = fact * j;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}

	static int fact_recursion(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * fact_recursion(n - 1));
		}
	}

	static int print() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("\n0. Exit");
		System.out.println("1. Fibonacci ");
		System.out.println("2. Prime Number ");
		System.out.println("3. Armstrong Number ");
		System.out.println("4. ");
		System.out.println("5. palindrome");
		System.out.println("6. Factorial ");
		System.out.print("Please enter your choice : ");

		int value = s1.nextInt();
		return value;
	}

	static void Armstrong(int num) {
		// 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
		System.out.println(num);
		temp = num;
		while (num > 0) {
			store = num % 10;
			sum = sum + (store * store * store);
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println(temp + " number is a Armstrong.\n");
		}else {
			System.out.println(temp + " isn't a Armstrong\n");
		}
		System.out.println("");

	}

	static void Palindrome() {
		// example 545, 151, 34543, 343, 171, 48984
		// string like:- LOL, MADAM
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
		System.out.println("");
	}

	public static void main(String[] args) {
		boolean loop_terminate = true;

		while (true) {
			int a = print();
			switch (a) {
			case 1: {
				while (loop_terminate) {
					System.out.println("\n1.Fibonacci Series using loop ");
					System.out.println("2.Fibonacci Series using recursion ");
					System.out.println("3.Return to Main Menu");
					System.out.print("Please enter your choice : ");
					Scanner s1 = new Scanner(System.in);
					int option2 = s1.nextInt();
					switch (option2) {
					case 1: {
						System.out.print("\nEnter a number : ");
						int num = scanner();
						Fibonacci(num);
						break;
					}
					case 2: {
						System.out.print("\nEnter a number : ");
						int num = scanner();
						System.out.print(n1 + " " + n2);
						R_Fibonacci(num - 2);// n-2 because 2 numbers are already printed
						System.out.println("\n");
					}
					case 3: {
						loop_terminate = false;
						break;
					}
					default:
						System.out.println("Invalid option");
						break;
					}
				}
			}
				break;// never forget to add this break statement

			case 2: {
				while (loop_terminate) {
					System.out.println("\n1.Prime Number  ");
					System.out.println("2.Prime Number Another way ");
					System.out.println("3.Return to Main Menu");
					System.out.print("Please enter your choice : ");
					Scanner s1 = new Scanner(System.in);
					int option2 = s1.nextInt();
					switch (option2) {
					case 1: {
						System.out.println("");
						System.out.print("Enter a number : ");
						int num = scanner();
						prime(num);
						break;
					}
					case 2: {
						System.out.println("");
						System.out.print("Enter a number : ");
						int num = scanner();
						isPrime(num);
						if (isPrime(num)) {
							System.out.println(num + " is a prime number\n");
						} else {
							System.out.println(num + " is not a prime number\n");
						}
						break;
					}
					case 3: {
						loop_terminate = false;
						break;
					}
					default:
						System.out.println("Invalid option");
						break;
					}
				}
			}
				break;// never forget to add this break statement

			case 3: {
				System.out.print("\nEnter a number : ");
				int num = scanner();
				Armstrong(num);
				break;
			}
			case 4: {

			}
			case 5: {
				Palindrome();
				break;
			}
			case 6: {
				while (loop_terminate) {
					System.out.println("\n1.Factorial Program using loop ");
					System.out.println("2.Factorial Program using recursion ");
					System.out.println("3.Return to Main Menu");
					System.out.print("Please enter your choice : ");
					Scanner s1 = new Scanner(System.in);
					int option2 = s1.nextInt();
					switch (option2) {
					case 1: {
						System.out.print("\nEnter a number : ");
						int num = scanner();
						fact(num);
						break;
					}
					case 2: {
						int fact = 1;
						System.out.print("\nEnter a number : ");
						int num = scanner();
						fact = fact_recursion(num);
						System.out.println("Factorial of " + num + " is: " + fact);
						break;
					}
					case 3: {
						loop_terminate = false;
						break;
					}
					default:
						System.out.println("Invalid option");
						break;
					}
				}
			}
				break;// never forget to add this break statement
			case 7: {

			}
			case 44: {

			}

			case 0: {
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + a);
			}
		}
	}

}

import java.util.Scanner;

public class Java_Basic_Programs2 {
	static int n1 = 0, n2 = 1, n3, sum = 0, temp, store;

	static void add() {
		int a = 5;
		System.out.println("Addition " + a);
	}

	static void multi() {
		int a = 15;
		System.out.println("Addition " + a);
	}

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
	static void printFibonacci(int count) {
		// Fibonacci series program in java using recursion.
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}
	
	static int scanner() {
		Scanner s1= new Scanner (System.in);
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

	static int print() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Fibonacci Series");
		System.out.println("2. Fibonacci Series using recursion");
		System.out.println("3. Prime");
		
		int value = s1.nextInt();
		return value;
	}

	public static void main(String[] args) {
		boolean loop_terminate = true;

		while (true) {
			int a = print();
			switch (a) {
			case 1: {
				System.out.print("Enter number of Fibonacci series:- ");
				int num = scanner();
				Fibonacci(num);
				break;
			}
			case 2: {
				System.out.print("Enter number of Fibonacci series:- ");
				int num = scanner();
				System.out.print(n1 + " " + n2);
				printFibonacci(num - 2);// n-2 because 2 numbers are already printed
				System.out.println("\n");
				break;
			}
			case 3: {
				System.out.print("Enter a number : ");  
				 int num = scanner();
				 prime(num);
				 break;
			}
			case 0: {
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + a);
			}
			// print();
		}
	}

}


public class Java_Basic_Programs {
	static int n1 = 0, n2 = 1, n3;

	public static void main(String[] args) {
		// Fibonacci(10);
		// --------------------------------------------------------

		// ----------------called printFibonacci()
		int count = 10;
		// System.out.print(n1 + " " + n2);
		// printFibonacci(count - 2); // n-2 because 2 numbers are already printed
		// ------------------------------------------------------------------

		//----------- called prime()
		//prime(43);
		isPrime(23);
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

	public static void isPrime(int num) {
		if (num <= 1) {
			System.out.println(num+" Not prime no");
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				System.out.println(num+" Not prime no");
			}
		}
		System.out.println(num+" Prime no");
	}
//-----------------------------------------------------------------

}

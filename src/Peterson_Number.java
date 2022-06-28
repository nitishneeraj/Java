import java.util.Scanner;

public class Peterson_Number {
	static long[] factorial = new long[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

	void peterson_No() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number to check: ");
		int n = sc.nextInt();
		if (isPeterson(n))
			System.out.println("The given number is a Peterson number.");
		else
			System.out.println("The given number is not a Peterson number.");
	}

	// function to check the given number is Peterson or not
	static boolean isPeterson(int n) {
		int num = n, sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += factorial[digit];
			n = n / 10;
		}
		return (sum == num);
	}
}

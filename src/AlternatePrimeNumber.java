import java.util.Scanner;

public class AlternatePrimeNumber {

	int scan() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter range to find Alternate prime numbers: ");
		int num = sc.nextInt();
		System.out.print("\nAlternate prime numbers up to " + num + " are: ");
		return num;
	}

	void Alternate_Prime_Number() {
		int value = scan();
		printAlternatePrimeNumber(value);
	}

	void printAlternatePrimeNumber(int n) {
		// if the value of temp variable is odd, we do not print the prime number
		// if the value of temp variable is even, we print the prime number
		int temp = 2;
		for (int num = 2; num <= n - 1; num++) {
			// checking the number is prime or not
			if (checkPrime(num) == 1) {  // all prime no: 2,3,5,7,11,13,15....
				// prints the prime number if temp is even
				if (temp % 2 == 0) {
					System.out.print(num + " ");
				// increments the temp variable by 1
				//System.out.println("\ntesting:-"+temp+"testing ");
				}
				temp++;
			}
		}

	}

	int checkPrime(int num) {
		int i, flag = 0;
		// we have started i=2 because 2 is a known prime number
		for (i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			return 1;
		else
			return 0;
	}

}

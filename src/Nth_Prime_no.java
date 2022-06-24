import java.util.Scanner;

public class Nth_Prime_no {

	void NthPrimeNumber() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n to compute the nth prime number: ");
		int n = sc.nextInt();
		int num=1, count=0, i; 
		while (count < n) {
//			System.out.println("\nFirst count "+count);
			num = num + 1;
//			System.out.println("Assign value "+num);
			for (i = 2; i <= num; i++) {
				// determines the modulo and compare it with 0
//				System.out.println("Num value======== "+num);
				if (num % i == 0) {
					// breaks the loop if the above condition returns true
					break; //Its means for loop se exit
				} 
			}
			if (i == num) {
				// increments the count variable by 1 if the number is prime
				count = count + 1;
//				System.out.println("Count value : "+count);
			}
		}
		System.out.println("The " +n +"th prime number is: " + num);  
	}
}

import java.util.ArrayList;
import java.util.Scanner;

public class Sieve_of_Eratosthenes {
	ArrayList<Integer> primelist = new ArrayList<Integer>();
	void NthPrimeNumber () {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the maximumm size as constant  ");
		int num = sc.nextInt();
		
		findnthPrimeNumber(num);
		System.out.println("7th prime number is " + primelist.get(6)); 
		System.out.println("22nd prime number is " + primelist.get(21));
	}

	void findnthPrimeNumber(int num) {
		boolean[] IsPrime = new boolean[num];
		for (int i = 0; i < num; i++)
			IsPrime[i] = true;
		for (int p = 2; p * p < num; p++) {
			// If IsPrime[p] is not changed,
			// then it is a prime
			if (IsPrime[p] == true) {
				// finds the multiples of p greater than or equal to the square of it
				// we have already marked the numbers that rae multiple of p and are less than p
				// to the power 2
				for (int i = p * p; i < num; i += p)
					IsPrime[i] = false;
			}
		}
		for (int p = 2; p < num; p++)
			if (IsPrime[p] == true)
				// adding prime number to the ArrayList
				primelist.add(p);
	}
}
		
	


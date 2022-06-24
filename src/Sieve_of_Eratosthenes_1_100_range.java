import java.util.Scanner;

public class Sieve_of_Eratosthenes_1_100_range {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a number : ");
		int num = sc.nextInt();
		boolean[] bool = new boolean[num];

		for (int i = 0; i < bool.length; i++) {
			bool[i] = true;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			//System.out.println(i);
			if (bool[i] == true) {
				//System.out.println("Value = "+i);
				for (int j = (i * i); j < num; j = j + i) {
					System.out.print(j+" ");
					bool[j] = false;	// Because 4,6 already pehle hi false ho gya h
				}
				System.out.println();
			} 
			//System.out.println(i);
		}
		System.out.println("\nList of prime numbers upto given number are : ");
		for (int i = 2; i < bool.length; i++) {
			if (bool[i] == true) {
				System.out.print(i+" ");
				}
		}
	}
}

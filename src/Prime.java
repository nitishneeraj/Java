import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		if (isPrime(n)) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
		
		Prime p1  = new Prime();
		System.out.println(p1.prime(n));
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public String prime(int a) {
		int temp=0,num =a; 
		for (int i = 0; i < a; i++) {
			if(a%2==0) {
				temp = temp +1;
			}
		}
		if(num ==temp) {
			return "Not Prime";
		}
		else {
			return "prime";
		}
		
	}
	
	
	
	
	
	
	
}

import java.util.Scanner;

public class Square_Root {

	void FindSquareRoot() {
		// x=√x
		// sqrtn+1=(sqrtn+(num/sqrtn))/2.0

		System.out.print("\nEnter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The square root of " + n + " is: " + squareRoot(n));
	}

	double squareRoot(int num) {
		double t;  
		double sqrtroot=num/2;  
		do   
		{  
		t=sqrtroot;  
		sqrtroot=(t+(num/t))/2;  
		}   
		while((t-sqrtroot)!= 0);  
		return sqrtroot;   
	}
}

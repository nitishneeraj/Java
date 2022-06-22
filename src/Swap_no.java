import java.util.Scanner;

public class Swap_no {
	
	
	
	void Swap_Two_Numbers_Using_Bitwise_Operator() {
		int a, b;  
		Scanner scanner = new Scanner(System.in);  
		System.out.print("Enter the first number: ");  
		a = scanner.nextInt();  
		System.out.print("Enter the second number: ");  
		b = scanner.nextInt(); 
		System.out.println("Before swapping:");  
		System.out.println("a = " +a +", b = " +b); 
		/*Bitwise XOR Operation of 5 and 7
		  0101
		^ 0111 
		 ________
		  0010  = 2 (In decimal) */
		a = a ^ b;  
		b = a ^ b;  
		a = a ^ b;  
		System.out.println("After swapping:");  
		System.out.print("a = " +a +", b = " +b);  
	}

}

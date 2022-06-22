
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number_programs_others {
	Scanner s1 = new Scanner(System.in);
	List<Integer> l1 = new ArrayList<Integer>();

	int scan() {
		System.out.print("\n Entre Range Number:- ");
		int num = s1.nextInt();
		return num;
	}

	void Sum_of_Natural_Numbers() {
		// Sum of n natural numbers=n*(n+1)/2
		int value = scan();
		int sum = 0;
		for (int i = 1; i <= value; i++) {
			sum += i;
		}
		System.out.println("Sum of First " + value + " Natural Numbers is = " + sum);
	}

	void Display_Odd_Numbers() {
		int value = scan();
		for (int i = 1; i <= value; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}

	void Display_Even_Numbers() {
		int value = scan();
		for (int i = 1; i <= value; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	boolean checkPerfectSquare(double number) {

		for (int i = 1; i * i <= number; i++) {
			if ((number % i == 0) && (number / i == i)) {
				// returns true if both conditions are true
				return true;
			}
		}
		return false; // returns false if any one condition is false
	}

	void Positive_or_Negative() {
		int value = scan();
		if (value < 0) {
			System.out.println("Your Enter number is Negative");
		} else {
			System.out.println("Your Enter number is Positive");
		}
	}

	List<Integer> scan1() {

		int a, b, c;
		System.out.println("Enter the first number:");
		a = s1.nextInt();
		System.out.println("Enter the second number:");
		b = s1.nextInt();
		System.out.println("Enter the third number:");
		c = s1.nextInt();
		l1.add(a);
		l1.add(b);
		l1.add(c);
		return l1;
	}

	void SmallestNumber() {
		int a, b, c, smallest, temp;
		List<Integer> value = scan1();
		// System.out.println(value);
		a = l1.get(0);
		b = l1.get(1);
		c = l1.get(2);
		temp = a < b ? a : b;
		smallest = c < temp ? c : temp;
		System.out.println("The smallest number is: " + smallest);
	}

	void Largest_of_Three_Numbers() {
		List<Integer> value = scan1();
		// System.out.println(value);
		int a = l1.get(0);
		int b = l1.get(1);
		int c = l1.get(2);
		int temp = a > b ? a : b;
		int largest = c > temp ? c : temp;
		System.out.println("The largest number is: " + largest);
	}

}

import java.util.Scanner;

public class Buzz_Number {

	void Buzz_No() {
		int range;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of range");
		range = sc.nextInt();
		for (int i = 1; i <= range; i++)
			checkNumber(i);
	}

	void checkNumber(int number) {
		// check whether the number ends with 7, is divisible by 7 or not
		if (number % 10 == 7 || number % 7 == 0)
			//System.out.println(number + " is an Buzz number");
			System.out.print(number + " ");
	}
}

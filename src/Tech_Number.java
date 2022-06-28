import java.util.Scanner;

public class Tech_Number {

	void tech_Number() {
		Scanner sc = new Scanner(System.in);
		int n, num, firstHalf, secondHalf, digits = 0, squareOfSum = 0;
		System.out.print("\nEnter any Number : ");
		num = 2025;// sc.nextInt();
		n = num;
		while (num > 0) {
			digits++;
			// System.out.println(digits);

			num = num / 10;
			// System.out.println("=========="+num);
		}
		// System.out.println("Value======= "+digits);
		if (digits % 2 == 0) {
			num = n;
			firstHalf = num % (int) Math.pow(10, digits / 2);// Math.pow(10, 4 / 2) = 10*2=100
			secondHalf = num / (int) Math.pow(10, digits / 2);
			squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);
			if (n == squareOfSum) {
				System.out.println(n + " is a tech number.");
			} else {
				System.out.println(n + " is not a tech number.");
			}
		} else {
			System.out.println(n + " is not a tech number.");
		}
	}

}

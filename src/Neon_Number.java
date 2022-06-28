import java.util.Scanner;

public class Neon_Number {

	void Neon_No() {
		Scanner sc = new Scanner(System.in);
		// System.out.println("\nEnter any number : ");
		int num = 92, sum = 0, listdigit = 0, multi;
		// sc.nextInt();
		multi = num * num;
		while (multi > 0) {
			listdigit = multi % 10;
			sum = sum + listdigit;
			multi = multi / 10;
		}
		//System.out.println("===" + sum);
		if (num == sum) {
			System.out.println(num + " is a Neon Number.");
		} else {
			System.out.println(num + " is not a Neon Number.");
		}
	}
}

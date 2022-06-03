import java.util.Scanner;

public class Palindrome {
	// 454,12321
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int value = s1.nextInt();
		System.out.println(Pali(value));
	}

	public static String Pali(int num) {
		int r, sum = 0, temp;
		temp = num;
		while (num > 0) {
			r = num % 10;
			sum = sum * 10 + r;
			num = num / 10;
		}
		if (temp == num) {
			return "yes";
		} else
			return "No";

	}

}

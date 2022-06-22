import java.util.Scanner;

public class Array_Linear_Search {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int value = s1.nextInt();
		int[] num = new int[value];
		for (int i = 0; i < num.length; i++) {
			num[i] = s1.nextInt();
		}

		int x = s1.nextInt();
		for (int i = 0; i < num.length; i++) {
			if (num[i] == x) {
				System.out.println("x found at index: " + i);

			}
		}

	}
}

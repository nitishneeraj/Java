import java.util.Scanner;

public class Star_Pattern {

	static int scanner() {
		Scanner s1 = new Scanner(System.in);
		System.out.print("\nEnter number to star pattern:- ");
		int num = s1.nextInt();
		return num;
	}

	void Right_Triangle_Star_Pattern() {
		int value = scanner();
		for (int i = 0; i <= value; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	void Left_Triangle_Star_Pattern() {
		int value = scanner();
		for (int i = 0; i <= value; i++) {
			for (int j = value - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	void Pyramid_Star_Pattern() {
		int value = scanner();
		for (int i = 0; i <= value; i++) {
			for (int j = value - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	void Diamond_Shape_Pattern() {
		int value = scanner();
		for (int i = 0; i <= value; i++) {
			for (int j = value - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for (int i = 0; i <= value; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = value -1; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	void Downward_Triangle_Star_Pattern() {
		int value = scanner();
		for (int i = 0; i < value; i++) {
			for (int j = value -1; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}

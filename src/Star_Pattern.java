import java.util.Scanner;

public class Star_Pattern {

	static int scanner() {
		Scanner s1 = new Scanner(System.in);
		System.out.print("\nEnter number to star/Number pattern:- ");
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
			for (int j = value - 1; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

	void Downward_Triangle_Star_Pattern() {
		int value = scanner();
		for (int i = 0; i < value; i++) {
			for (int j = value - 1; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	void Mirrored_Right_Triangle_Star_Pattern() {
		int value = scanner();
		for (int i = 0; i < value; i++) {
			for (int j = value - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void Reverse_Pyramid_Star_Pattern() {
		int value = scanner();
		for (int i = 0; i <= value - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = value - 1; j >= i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}

	void Right_Down_Mirror_Star_Pattern() {
		int value = scanner();
		for (int i = 0; i <= value - 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = value - 1; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	void Right_Pascals_Triangle() {
		int value = scanner();
		for (int i = 0; i <= value - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i <= value - 1; i++) {
			for (int j = value - 1; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	void Sandglass_Star_Pattern() {
		int value = scanner();
		for (int i = 0; i <= value - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = value - 1; j >= i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
		for (int i = 0; i <= value - 1; i++) {
			for (int j = value - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}

	void Left_Pascals_Triangle() {
		int value = scanner();
		for (int i = 0; i <= value - 1; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = value - 1; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i <= value - 1; i++) {
			for (int j = value - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("  ");
			}
			for (int j = value - 1; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	void Alphabet_Star_Pattern() {
		System.out.println("Comming soon");
	}

	void Diamond_Star_Pattern() {
		System.out.println("Comming soon");
	}

	void Down_Triangle_Pattern() {
		System.out.println("Comming soon");
	}

	void Triangle_Star_Pattern() {
		System.out.println("Comming soon");
	}

	// -----------------------------------------------------------------------------------

	
}

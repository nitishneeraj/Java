import java.util.Iterator;

public class Number_Pattern extends Star_Pattern {

	Star_Pattern st1 = new Star_Pattern();

	void Pattern_1() {
		int value = st1.scanner();
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	void Pattern_2() {
		int value = st1.scanner();
		int k = 1;
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println("");
		}
	}

	void Pattern_3() {
		int value = st1.scanner();
		int k = 1;
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(k++ + " ");
			}
			System.out.println("");
		}
	}

	void Pattern_5() {
		int value = st1.scanner();
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}

	void Pattern_6() {
		int value = st1.scanner();
		for (int i = value - 1; i >= 1; i--) {
			for (int j = value - 1; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	void Pattern_7() {
		int value = st1.scanner();
		for (int i = 1; i <= value; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

	void Pattern_9() {
		int value = st1.scanner();
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print(0);
				} else {
					System.out.print(1);
				}
			}
			System.out.println("");
		}
	}

	void Pattern_11() {
		int value = st1.scanner();
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		for (int i = value - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	void Pattern_12() {
		int value = st1.scanner();
		for (int i = 1; i <= value; i++) {
			for (int j = value - 1; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	void Pattern_13() {
		int value = st1.scanner();
		for (int i = value; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	void Pattern_14() {
		int value = st1.scanner();
		for (int i = 1; i <= value; i++) {
			for (int j = value - 1; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	void Pattern_15() {
		int value = st1.scanner();
		for (int i = 1; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	void Pattern_16() {
		int value = st1.scanner();
		for (int i = value; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		for (int i = 2; i <= value; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	void Pattern_17() {
		int value = st1.scanner();
		for (int i = 0; i < value; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i+1; j <= value; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = value-1; i >= 1; i--) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= value; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}


}

package Matrix_Programs;

public class Transpose_matrix {

	void TransposeMatrix() {
		int[][] original = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

		int[][] Transpose = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Transpose[j][i] = original[i][j];
			}
		}
		System.out.println("\nPrinting Matrix without transpose:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.println();// new line
		}

		System.out.println("\nPrinting Matrix After Transpose:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(Transpose[i][j] + " ");
			}
			System.out.println();// new line

		}
	}
}

package Matrix_Programs;

public class Sub_matrices {
	void sub_matrices() {
		// Initialize matrix a
		int a[][] = { { 4, 5, 6 }, { 3, 4, 1 }, { 1, 2, 3 } };

		// Initialize matrix b
		int b[][] = { { 2, 0, 3 }, { 2, 3, 1 }, { 1, 1, 1 } };

		// creating another matrix to store the sub of two matrices
		int[][] sub = new int[3][3];

		// adding and printing addition of 2 matrices
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sub[i][j] = a[i][j] - b[i][j];
				System.out.print(sub[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

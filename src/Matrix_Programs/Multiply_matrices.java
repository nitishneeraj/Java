package Matrix_Programs;

public class Multiply_matrices {
	void multiplyMatrices() {
		// creating two matrices
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		// creating another matrix to store the multiplication of two matrices
		int multi[][] = new int[3][3]; // 3 rows and 3 columns

		// multiplying and printing multiplication of 2 matrices
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				multi[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					multi[i][j] += a[i][k] * b[k][j];
				} // end of k loop
				System.out.print(multi[i][j] + " "); // printing matrix element
			}
			System.out.println();
		}
		System.out.println();

	}

}

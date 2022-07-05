package Matrix_Programs;

public class Add_matrices {

	void add_matrices() {
		// creating two matrices
		int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };

		// creating another matrix to store the sum of two matrices
		int[][] sum = new int[3][3];

		// adding and printing addition of 2 matrices
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i][j] = a[i][j] + b[i][j];
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}

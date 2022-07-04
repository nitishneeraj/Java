package Array_Programs;

public class Using_Array_Even_odd {

	void OddEvenInArray() {
		int arr[] = { 22, 1, 5, 7, 3, 17, 40, 30, 15, 16, 1, 2, 5, 6, 3, 2 };
		System.out.println("\nEven Numbers:");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		System.out.println("\nOdd Numbers:");
		for (int j = 0; j < arr.length; j++) {
			if (j % 2 != 0) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
	}
}

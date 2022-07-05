package Searching_Sorting_Programs;

public class Bubble_Sort {

	void BubbleSort() {
		int arr[] = { 5, 6, 3, 1, 4, 0, 2, 7 };

		System.out.println("\nArray Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j] < arr[j - 1]) {
					// swap elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("\nArray After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}

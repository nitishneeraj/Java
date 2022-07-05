package Searching_Sorting_Programs;

public class Selection_Sort {

	void SelectionSort() {
		int arr[] = { 5, 6, 3, 1, 4, 0, 2, 7 };

		System.out.println("\nArray Before Selection Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = i + 1; j < (arr.length); j++) {
				if (arr[i] > arr[j]) {
					// swap elements
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		System.out.println("\nArray After Selection Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
}

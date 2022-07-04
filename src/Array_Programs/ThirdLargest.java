package Array_Programs;

import java.util.Scanner;

public class ThirdLargest {

	void Third_Largest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the lenght of array: ");
		int num = sc.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			// System.out.println("Your Enter array");
			System.out.print(arr[i] + " ");
		}

		System.out.print("\nThird Largest : " + arr[arr.length - 3]);
		System.out.println();
	}

}

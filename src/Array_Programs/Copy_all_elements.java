package Array_Programs;

import java.util.Scanner;

public class Copy_all_elements {

	void CopyElements() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the lenght of array : ");
		int num1 = sc.nextInt();
		
		int[] arr1 = new int[num1];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int[] arr2 = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i]; // Copy first array to second array
		}

		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " "); // Print First array
		}
		System.out.println();

		System.out.println("Elements of new array: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}

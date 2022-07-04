package Array_Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort_Array {

	/*
	 * void SortArray() { int arr[] = {1,4,2,6,-1,0};
	 * System.out.println("\nArray elements after sorting:"); for (int i = 0; i <
	 * arr.length; i++) { for (int j = i+1; j < arr.length; j++) { int temp =0;
	 * if(arr[i]>arr[j]) { temp = arr[i]; arr[i]=arr[j]; arr[j]= temp; } }
	 * System.out.print(arr[i]+" "); } System.out.println(); }
	 */

	void SortArray() {
		int arr[] = { 1, 4, 2, 6, -1, 0 };
		Arrays.sort(arr);
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}

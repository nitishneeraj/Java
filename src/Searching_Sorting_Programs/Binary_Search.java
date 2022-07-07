package Searching_Sorting_Programs;

import java.util.Arrays;

public class Binary_Search {

	void BinarySearch() {
		// Binary search is faster than linear search.
		// array elements must be in ascending order
		int arr[] = {6,5,4,3,2,1,0,2,3,7,9,8,66};
		Arrays.sort(arr);

		// Remove Duplicate Element
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) { // Index out of bound

			if (arr[i] != arr[i + 1]) {// first value not equal to second value
				arr[j] = arr[i]; // store value j variable
				j++; // increment j value
			}
		}
		arr[j] = arr[arr.length - 1];

		System.out.println();
		for (int i = 0; i < j + 1; i++) { // Print sort array list
			System.out.print(arr[i] + " ");
		}

//		System.out.println();
//		int search = 6; // find value in list
//		int li = 0;// lower index
//		int hi = arr.length - 1;// higher index
//		int mean = li + hi / 2;
//		while (li <= hi) {
//			// middle index
//			if (arr[mean] == search) {
//				System.out.println(search + ": element is found at index: " + mean);
//				break;
//			} else if (arr[mean] < search) {
//				li = mean + 1;
//			} else {
//				hi = mean - 1;
//			}
//			mean = li + hi / 2;
//		}
//		if (li > hi) {
//			System.out.println("Elements not found");
//		}
//		System.out.println();
		
		
		
		int key = 66;  
        int last=arr.length-1; 
        int result = binarySearch(arr,0,last,key);  
        if (result == -1)  
            System.out.println("\nElement is not found!");  
        else  
            System.out.println("\nElement is found at index: "+result);  
		
	}
	
	int binarySearch(int arr[], int first, int last, int key) {
		if (last >= first) {
			int mid = first + (last - first) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return binarySearch(arr, first, mid - 1, key);// search in left subarray
			} else {
				return binarySearch(arr, mid + 1, last, key);// search in right subarray
			}
		}
		return -1;
	}

}

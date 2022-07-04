package Array_Programs;

import java.util.Arrays;

public class RemoveDuplicate {
	void removeDuplicateElements() {
		int arr[] = { 1, 1, 3, 4, 5, 5,8, 6, 3, 7, 7, 9, 9, 0, 11 };

		Arrays.sort(arr); //array sort
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) { //Index out of bound
			
			if (arr[i] != arr[i + 1]) {//first value not equal to second value
				arr[j]= arr[i]; //store value j variable 
				j++; //increment j value
			}	
		}
		arr[j]= arr[arr.length-1];  // print last value
		
		for (int i = 0; i < j+1; i++) { //j+1 because print last value
			System.out.print(arr[i]+" ");
		}
	}
}

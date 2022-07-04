package Array_Programs;

public class LargeststElement {

	void Largest_Element() {
int [] arr = new int [] {25, 11, 7, 75, 56}; 
		
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			} 
		}
		System.out.print("\nLargest element present in given array: " + max);
		System.out.println();
	}
}

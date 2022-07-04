package Array_Programs;

public class smallestElement {
	
	void smallest_Element() {
		int [] arr = new int [] {25, 11, 7, 75, 56}; 
		
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			} 
		}
		 System.out.print("\nSmallest element present in given array: " + min);
		System.out.println();
	}

}

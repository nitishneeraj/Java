package Array_Programs;

public class left_rotate_elements {

	void leftRotateElements() {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int n = 2; //n determine the number of times an array should be rotated  
		System.out.println("\nOriginal array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < n; i++) {
			int first = arr[0];//Stores the first element of the array  
			for (int j = 0; j < arr.length-1; j++) {
				arr[j] = arr[j + 1]; //Shift element of array by one  
			}
			arr[arr.length-1] = first;//First element of array will be added to the end  
		}
		System.out.println();

		System.out.println("\nArray after left rotation: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

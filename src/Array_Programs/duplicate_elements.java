package Array_Programs;

public class duplicate_elements {

	void DuplicateElements() {
		int[] arr = { 1, 2, 2, 1, 3, 4, 4, 5, 6,6, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]+" ");	
				}
			}
		}
	}

}

package Array_Programs;

public class Largest_Number {

	void LargestNumber() {

		int[] arr = { 2, 1, 0, 4, 3, 6, 5, 10, 11,50 };
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Largest Number :"+arr[arr.length-1]);
		System.out.println(" ");
	}

}

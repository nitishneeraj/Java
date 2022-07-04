package Array_Programs;

public class SmallestArray {

	void Smallest_Array() {
		int arr[] = { 1, 4, 2, 6, -1, 0 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("\nSmallest: " + arr[0]);
		System.out.println(" ");
	}
}

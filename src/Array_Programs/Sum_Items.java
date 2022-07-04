package Array_Programs;

import java.util.Scanner;

public class Sum_Items {

	void SumItems() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the lenght of array : ");
		int num = sc.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.print("\nSum Array Elements : " + sum);
	}

}

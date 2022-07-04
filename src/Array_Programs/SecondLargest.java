package Array_Programs;

import java.util.Scanner;

public class SecondLargest {
	
	void Second_Largest() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the lenght of array: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			int temp =0;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Second Largest : "+arr[arr.length-2]);
		System.out.println();
	}

}

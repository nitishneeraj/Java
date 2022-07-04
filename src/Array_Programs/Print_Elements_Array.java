package Array_Programs;

import java.util.Scanner;

public class Print_Elements_Array {

	void print_elements_Array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lngth of array' ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

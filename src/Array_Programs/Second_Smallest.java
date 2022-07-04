package Array_Programs;

public class Second_Smallest {
	void SecondSmallest() {
		int a[] = { 44, 66, 99, 77, 33, 22, 55 };
		for (int i = 0; i < a.length; i++) {
			int temp = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("\nSecond Smallest :"+a[1]);
		System.out.println();
	}

}

package Array_Programs;

import java.util.Scanner;

public class frequency_element_array {

	Java_Array_Programs jb = new Java_Array_Programs();
	Scanner sc = new Scanner(System.in);

	void frequencyElementArray() {

		int num = jb.scan();
		int visited = -1;
		int[] arr = new int[num];
		int[] fr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
//            	System.out.println("XXXXX "+i);
//            	System.out.println("WWWWW "+j);
				if (arr[i] == arr[j]) {
//                	System.out.println("1111 "+arr[i]);
//                	System.out.println("++ "+arr[j]);
					count++;
//                    System.out.println("** "+count);
					// To avoid counting same element again
					fr[j] = visited;
//                    System.out.println("// "+fr[j]);
				}
			}
			if (fr[i] != visited)
				fr[i] = count;
//            System.out.println("%%"+fr[i]);
		}

		
		/*
		 * for (int i = 0; i < 1; i++) { System.out.println("qqq "+fr[0]);
		 * System.out.println("111111111 "+arr[0]); System.out.println("ppp "+fr[1]);
		 * System.out.println("222222222 "+arr[1]); System.out.println("aaa "+fr[2]);
		 * System.out.println("333333333 "+arr[2]);
		 * 
		 * System.out.println("==============================="); }
		 */
		 

		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("    " + arr[i] + "    |    " + fr[i]);
		}
		System.out.println("----------------------------------------");

	}
}

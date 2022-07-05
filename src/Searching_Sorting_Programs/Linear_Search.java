package Searching_Sorting_Programs;

public class Linear_Search {

	void LinearSearch() {
		int[] a1= {10,20,30,50,70,90};
		int key = 50;    
		for (int i = 0; i < a1.length; i++) {
			if(a1[i] == key) {
				System.out.println("\n"+key+" is found at index: "+i);
			}
		}
		
		
	}
}

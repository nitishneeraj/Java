package Array_Programs;

public class Insert_Element {

	void InsertElement() {
		int[] arr = { 1, 2, 3, 4, 5 };
		int position = 3;
		int addElement = 33;
		for (int i = arr.length - 1; i > position - 1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[position - 1] = addElement;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

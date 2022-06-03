import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculater {
	Scanner scan = new Scanner(System.in);

	public int operation() {
		System.out.println("\t1.Addition");
		System.out.println("\t2.Mutiplication");
		System.out.println("\t3.Subtration");
		System.out.println("\t4.Divide");
		System.out.println("\t5.Mode");
		System.out.println("\t6.Exit");
		System.out.print("Enter Any number to operate operation:- ");
		int number = scan.nextInt();
		return number;
	}

	public List<Integer> Scanner() {
		List<Integer> list = new ArrayList<Integer>();
		System.out.print("Enter First Number:- ");
		int first_value = scan.nextInt();
		list.add(first_value);
		System.out.print("Enter Second Number:- ");
		int Second_value = scan.nextInt();
		list.add(Second_value);
		return list;
	}

	public static void main(String[] args) {
		Calculater a1 = new Calculater();
		int a = 0, b = 0, sum;
		switch (a1.operation()) {
		case 1: {
			List<Integer> l2 = a1.Scanner();
			int[] array = new int[l2.size()];
			for (int i = 0; i < l2.size(); i++) {
				array[i] = l2.get(i);
				if (i == 0) {
					a = array[i];
				} else {
					b = array[i];
				}
			}
			sum = a + b;
			System.out.println("Addition:- " + sum);
			break;
		}
		case 2: {
			List<Integer> l2 = a1.Scanner();
			int[] array = new int[l2.size()];
			for (int i = 0; i < l2.size(); i++) {
				array[i] = l2.get(i);
				if (i == 0) {
					a = array[i];
				} else {
					b = array[i];
				}
			}
			sum = a * b;
			System.out.println("Mutiplication:- " + sum);
			break;
		}
		case 3: {
			List<Integer> l2 = a1.Scanner();
			int[] array = new int[l2.size()];
			for (int i = 0; i < l2.size(); i++) {
				array[i] = l2.get(i);
				if (i == 0) {
					a = array[i];
				} else {
					b = array[i];
				}
			}
			sum = a - b;
			System.out.println("Subtraction:- " + sum);
			break;
		}
		case 4: {
			List<Integer> l2 = a1.Scanner();
			int[] array = new int[l2.size()];
			for (int i = 0; i < l2.size(); i++) {
				array[i] = l2.get(i);
				if (i == 0) {
					a = array[i];
				} else {
					b = array[i];
				}
			}
			sum = a / b;
			System.out.println("Divide:- " + sum);
			break;
		}
		case 5: {
			List<Integer> l2 = a1.Scanner();
			int[] array = new int[l2.size()];
			for (int i = 0; i < l2.size(); i++) {
				array[i] = l2.get(i);
				if (i == 0) {
					a = array[i];
				} else {
					b = array[i];
				}
			}
			sum = a % b;
			System.out.println("Mode:- " + sum);
			break;
		}
		case 6: {
			return;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + a1.operation());
		}

	}

}

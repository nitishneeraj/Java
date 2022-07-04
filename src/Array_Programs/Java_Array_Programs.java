package Array_Programs;

import java.util.Scanner;

public class Java_Array_Programs {
	static Scanner input = new Scanner(System.in);

	int scan() {
		System.out.print("\nEnter the lenght of array : ");
		int num1 = input.nextInt();
		return num1;
	}

	public static void main(String[] args) {
		int option1;
		boolean loop_terminate = true;
		while (true) {
			System.out.println("\n1.Copy all elements of one array into another array");
			System.out.println("2.Find the frequency of each element in the array");
			System.out.println("3.left rotate the Elements");
			System.out.println("4.Duplicate elements of an array");
			System.out.println("5.Print the elements of an array");
			System.out.println("6.Sort an Array");
			System.out.println("7.Print Odd and Even Numbers from an Array");
			System.out.println("8.Remove duplicate element in an Array");
			System.out.println("9.find Smallest Number in an Array");
			System.out.println("10.find Second Smallest Number in an Array");
			System.out.println("11.find Largest Number in an Array");
			System.out.println("12.find Second Largest Number in an Array");
			System.out.println("13.find Third Largest Number in an Array");
			System.out.println("14.Sort the elements of an array in descending order");
			System.out.println("15.Sort the elements of an array in ascending order");
			System.out.println("16.right rotate the elements");
			System.out.println("17.Insert An Element Into An Array");
			System.out.println("18.Sum of all the items of the array");
			System.out.println("19.Print the number of elements present in an array");
			System.out.println("20.Print the smallest element in an array");
			System.out.println("21.Print the largest element in an array");

			System.out.println("\n0.Exit main menu");

			System.out.print("Please enter your choice : ");
			option1 = input.nextInt();
			switch (option1) {
			case 1:
				Copy_all_elements C_Array = new Copy_all_elements();
				C_Array.CopyElements();
				break;
			case 2:
				frequency_element_array fr = new frequency_element_array();
				fr.frequencyElementArray();
				break;
			case 3:
//				 	Original Array:
//					 1   2   3   4   5
//					 Array after left rotation:
//					 4   5   1   2   3
				left_rotate_elements l1 = new left_rotate_elements();
				l1.leftRotateElements();
				break; // never forget to add this break statement
			case 4:
				duplicate_elements num1 = new duplicate_elements();
				num1.DuplicateElements();
				break;

			case 5:
				Print_Elements_Array arr = new Print_Elements_Array();
				arr.print_elements_Array();
				break;
			case 6:
				Sort_Array arr1 = new Sort_Array();
				arr1.SortArray();
				break;
			case 7:
				Using_Array_Even_odd value = new Using_Array_Even_odd();
				value.OddEvenInArray();
				break;
			case 8:
				RemoveDuplicate Duplicate = new RemoveDuplicate();
				Duplicate.removeDuplicateElements();
				break;
			case 9:
				SmallestArray array = new SmallestArray();
				array.Smallest_Array();
				break;
			case 10:
				Second_Smallest theSecSmall = new Second_Smallest();
				theSecSmall.SecondSmallest();
				break;
			case 11:
				Largest_Number theLargest = new Largest_Number();
				theLargest.LargestNumber();
				break;
			case 12:
				SecondLargest SecLargest = new SecondLargest();
				SecLargest.Second_Largest();
				break;
			case 13:
				ThirdLargest ThirdLargest = new ThirdLargest();
				ThirdLargest.Third_Largest();
				break;
			case 14:
				SortDescending Descending = new SortDescending();
				Descending.Sort_Descending();
				break;
			case 15:
				SortAscending Ascending = new SortAscending();
				Ascending.Sort_Descending();
				break;
			case 16:
//					Original Array:
//					1   2   3   4   5
//					Array after right rotation:
//					3   4   5   1   2
				Right_rotate_elements R1 = new Right_rotate_elements();
				R1.RightRotateElements();
				break;
			case 17:
				Insert_Element arr2 = new Insert_Element();
				arr2.InsertElement();
				break;
			case 18:
				Sum_Items sum = new Sum_Items();
				sum.SumItems();
				break;
			case 19:
				int array1[] = {1,2,3,4,5,6,7,8};
				 System.out.println("\nNumber of elements present in given array: " + array1.length); 
				break;
			case 20:
				smallestElement small = new smallestElement();
				small.smallest_Element();
				break;
			case 21:
				LargeststElement Largest = new LargeststElement();
				Largest.Largest_Element();
				break;
			case 0:
				return; // terminate outer menu

			default:
				System.out.println("Invalid option");
			}
		}
	}
}

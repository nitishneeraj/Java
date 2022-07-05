package Searching_Sorting_Programs;

import java.util.Scanner;

public class Searching_Sorting_Programs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // used to get input
		int option1;
		boolean loop_terminate = true; // flag used to terminate inner while loop

		// Main Menu
		while (true) {
			// Main Menu options
			System.out.println("\n1.Linear Search in Java");
			System.out.println("2.Binary Search in Java");
			System.out.println("3.Bubble Sort in Java");
			System.out.println("4.Selection Sort in Java");
			System.out.println("5.Insertion Sort in Java");
			System.out.println("6.Exit main menu");

			System.out.print("Please enter your choice : ");
			option1 = input.nextInt();

			switch (option1) {

			case 1:
				Linear_Search LS = new Linear_Search();
				LS.LinearSearch();
				break;
			case 2:
				Binary_Search BS = new Binary_Search();
				BS.BinarySearch();
				break;
			case 3:
				Bubble_Sort Bubble = new Bubble_Sort();
				Bubble.BubbleSort();
				break; // never forget to add this break statement
			case 4:
				Selection_Sort SS = new Selection_Sort();
				SS.SelectionSort();
				break;
			case 5:
				Insertion_Sort IS = new Insertion_Sort();
				IS.InsertionSort();
				break;
			case 6:
				return; // terminate outer 	menu

			default:
				System.out.println("Invalid option");
			}
		}
		
	}

}

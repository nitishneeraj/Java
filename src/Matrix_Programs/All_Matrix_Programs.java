package Matrix_Programs;

import java.util.Scanner;

public class All_Matrix_Programs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // used to get input
		int option1;
		boolean loop_terminate = true; // flag used to terminate inner while loop

		// Main Menu
		while (true) {
			// Main Menu options
			System.out.println("\n1.Add two matrices");
			System.out.println("2.Subtract the two matrices");
			System.out.println("3.Multiply two matrices");
			System.out.println("4.Transpose matrix");
			System.out.println("5.Display the lower triangular matrix");
			System.out.println("6.Display the upper triangular matrix");
			System.out.println("7.Determine whether two matrices are equal");
			System.out.println("8.Find the frequency of odd & even numbers in the given matrix");
			System.out.println("9.Find the sum of each row and each column of a matrix");
			System.out.println("10.Exit main menu");

			System.out.print("Please enter your choice : ");
			option1 = input.nextInt();

			switch (option1) {

			case 1:
				Add_matrices add = new Add_matrices();
				add.add_matrices();
				break;
			case 2:
				Sub_matrices sub = new Sub_matrices();
				sub.sub_matrices();
				break;
			case 3:
				Multiply_matrices multi = new Multiply_matrices();
				multi.multiplyMatrices();
				break; // never forget to add this break statement
			case 4:
				Transpose_matrix TM = new Transpose_matrix();
				TM.TransposeMatrix();
				break;
			case 5:
				Lower_triangular Lt = new Lower_triangular();
				Lt.LowerTriangular();
				break;
			case 6:
				Upper_triangular Ut = new Upper_triangular();
				Ut.UpperTriangular();
				break;
			case 7:
				Equal_Matrices EQ = new Equal_Matrices();
				EQ.EqualMatrices();
				break;
			case 8:
				Frequency_EvenOdd EO = new Frequency_EvenOdd();
				EO.FrequencyEvenOdd();
				break;
			case 9:
				Sum_of_Row_Column SOR = new Sum_of_Row_Column();
				SOR.SumofRowColumn();
				break;
			case 10:
				return; // terminate outer menu

			default:
				System.out.println("Invalid option");
			}
		}

	}

}

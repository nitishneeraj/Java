package String_Programs;

import java.util.Scanner;

public class All_Basic_String_Programs {
	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in); // used to get input
		int option1;
		boolean loop_terminate = true; // flag used to terminate inner while loop

		// Main Menu
		while (true) {
			// Main Menu options
			System.out.println("\n1.Count the total number of characters in a string");
			System.out.println("2.Program to Count the Total Number of Punctuation Characters Exists in a String");
			System.out.println("3.Count the total number of vowels and consonants in a string");
			System.out.println("4.Find Reverse of the string.");
			System.out.println("5.Find the duplicate characters in a string");
			System.out.println("6.Find the number of the words in the given text file");
			System.out.println("7.find the frequency of characters");
			System.out.println("8.Swap two string variables without using third or temp variable.");
			System.out.println("9.Separate the Individual Characters from a String");
			System.out.println("10.Remove all the white spaces from a string");
			System.out.println("11.Find the duplicate words in a string");
			System.out.println("12.Exit main menu");

			System.out.print("Please enter your choice : ");
			option1 = input.nextInt();

			switch (option1) {

			case 1:
				Count_Character CC = new Count_Character();
				CC.CountCharacter();
				break;
			case 2:
				// punctuation marks (!, . , ' , - , " , ? , ; ).
				Punctuation_Characters PC = new Punctuation_Characters();
				PC.PunctuationCharacters();
				break;
			case 3:
				Count_Vowel_Consonant CVC = new Count_Vowel_Consonant();
				CVC.CountVowelConsonant();
				break;
			case 4:
				Reverse_string RG = new Reverse_string();
				RG.ReverseString();
				RG.ReverseString1();
				break;
			case 5:
				Duplicate_characters DC = new Duplicate_characters();
				DC.DuplicateCharacters();
				break;
			case 6:
				Words_Count_text_file WC = new Words_Count_text_file();
				WC.WordsCountTextFile();
				break;
			case 7:
				FrequencyCharacters FC = new FrequencyCharacters();
				FC.Frequency_Characters();
				break;
			case 8:
				Swap_String temp = new Swap_String();
				temp.SwapString();
				break;
			case 9:
				Individual_Characters IC = new Individual_Characters();
				IC.IndividualCharacters();
				break;
			case 10:
				Remove_Spaces RS = new Remove_Spaces();
				RS.RemoveSpaces();
				break;
			case 11:
				Duplicate_Words DW = new Duplicate_Words();
				DW.DuplicateWords();
				break;
			case 12:
				return;

			default:
				System.out.println("Invalid option");
			}
		}
	}

}

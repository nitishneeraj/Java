package String_Programs;

import java.util.Iterator;

public class Duplicate_Words {

	void DuplicateWords() {

		String string = "Big black bug bit a big black dog on his big black nose";
		int count;

		// Split the string into words using built-in function
		String words[] = string.split(" ");

		System.out.println("Duplicate words in a given string : ");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			// Displays the duplicate word if count is greater than 1
			if (count > 1 && words[i] != "0")
				System.out.println(words[i]);
		}
	}

}

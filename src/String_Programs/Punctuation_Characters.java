package String_Programs;

public class Punctuation_Characters {

	void PunctuationCharacters() {
		// punctuation marks (!, . , ' , - , " , ? , ; ).

		int count = 0;
		String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.'
					|| str.charAt(i) == '?' || str.charAt(i) == '-' || str.charAt(i) == '\'' || str.charAt(i) == '\"'
					|| str.charAt(i) == ':') {
				count++;
			}	
		}
		System.out.println();
		System.out.println("The number of punctuations exists in the string is: " +count); 
		System.out.println();
	}
}

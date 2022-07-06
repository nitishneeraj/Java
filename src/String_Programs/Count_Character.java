package String_Programs;

public class Count_Character {

	void CountCharacter() {
		String string = "The best of both worlds";
		int count = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}
		System.out.println();
		System.out.println("\nTotal number of characters in a string: " + count);
		System.out.println();
	}
}

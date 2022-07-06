package String_Programs;

public class Swap_String {

	void SwapString() {
		String str1 = "Nitish";
		String str2 = "Kumar";
		System.out.println("Strings before swapping: " + str1 + " " + str2);
		str1 = str1 + str2;// cancat
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring(str2.length());
		System.out.println("Strings after swapping: " + str1 + " " + str2);
	}
}

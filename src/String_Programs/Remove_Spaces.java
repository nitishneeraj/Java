package String_Programs;

public class Remove_Spaces {

	void RemoveSpaces() {
		String str1 = "Remove white spaces";

		// Removes the white spaces using regex
		str1 = str1.replaceAll("\\s+", "");

		System.out.println("String after removing all the white spaces : " + str1);
	}

}

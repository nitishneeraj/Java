
public class Character_Pattern {
	
	Star_Pattern st1 = new Star_Pattern(); 
	
	void Right_Triangle_Alphabetic_Pattern() {
		int value = st1.scanner();
		System.out.println("Character value");
		int alphabet =value;
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println("");
		}
	}
	
}

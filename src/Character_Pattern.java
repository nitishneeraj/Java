
public class Character_Pattern {
	
	static Star_Pattern st1 = new Star_Pattern(); 
	
	static void Right_Triangle_Alphabetic_Pattern() {
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
	
	void Repeating_Alphabet_Pattern() {
		int value = st1.scanner();
		System.out.println("Character value");
		int alphabet =value;
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(alphabet+i)+" ");
			}
			System.out.println("");
		}
	}
	
	void K_shape_Alphabet_Pattern() {
		int value = st1.scanner();
		System.out.println("Character value");
		int alphabet =value;
		for (int i = 8; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(alphabet+j )+" ");
			}
			System.out.println("");
		}
		for (int i = 2; i < 8; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print((char)(alphabet+j )+" ");
			}
			System.out.println("");
		}
	}
	
	void Triangle_Character_Pattern() {
		int value = st1.scanner();
		System.out.println("Character value");
		int alphabet =value;
		for (int i = 0; i < 8; i++) {
			for (int j = 8-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print((char)(alphabet+j )+" ");
			}
			System.out.println("");
		}
	}
}

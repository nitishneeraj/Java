
public class Reverse_number {
	public static void main(String[] args) {
		 //System.out.println(reverseNumner(12345));
		 System.out.println(reverseString("Hello"));
	}
	
	public static int reverseNumner(int a) {
		int n, sum = 0;
		while (a != 0) {
			n = a % 10;
			sum = sum * 10 + n;
			a = a / 10;
		}
		return sum;
		
	}
	public static String reverseString(String str) {
		char ch;
		String rev = "";
		for (int i = 0; i < str.length() ; i++) {
			ch = str.charAt(i);
			System.out.println(ch);
			rev = ch+rev;
			System.out.println(rev);
		}
		return rev;
		
	}
}

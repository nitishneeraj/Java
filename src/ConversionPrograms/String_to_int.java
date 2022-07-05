package ConversionPrograms;

public class String_to_int {

	void StringInt() {
		// Java String to int Example: Integer.parseInt()
		String str = "200";
		int num = Integer.parseInt(str);
		System.out.println("Integer.parseInt(str) " + num);
		System.out.println();
	}

	void StringInt1() {
		// Java String to Integer Example: Integer.valueOf()
		String str = "1000";
		int num = Integer.valueOf(str);
		System.out.println("Integer.valueOf(str) " + num);
		System.out.println();
	}

	void Exception() {
		// NumberFormatException Case
		String str = "Hello";
		int i=Integer.parseInt(str);
		System.out.println(i);	
	}
}

package ConversionPrograms;

public class Int_to_String {

	void IntString() {
		// String.valueOf()
		int i1 = 10;
		String s = String.valueOf(i1);
		int i = 200;
		String s1 = String.valueOf(i);
		System.out.println(i + 100);// 300 because + is binary plus operator
		System.out.println(s1 + 100);
	}

	void IntString1() {
		// Integer.toString()
		int i=200;  
		String s=Integer.toString(i);  
		System.out.println(i+100);//300 because + is binary plus operator  
		System.out.println(s+100);
	}

}

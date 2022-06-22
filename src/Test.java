class Test {
	public static void main(String args[]) {
		Test t1 = new Test();
		// t1.character();
		// t1.missNumber();
		//math(9);
		//test1();
		t1.divide();
	}
	
	
	void divide() {
		int a1=4,b1=4;
		int b=a1 % 2 ;
		int b2=b1 / 2 ;
		System.out.println(b);
		System.out.println(b2);
	}

	public static void missNumber() {
		int arr[] = { 12, 13 };
		int a = 0, b = 0, sum;
		for (int i : arr) {
			arr[0] = a;
			arr[1] = b;
			System.out.println(a);
		}
		sum = a + b;
		System.out.println(sum);
	}

	public static void character() {
		String str = "Hello";
		char ch;

		ch = str.charAt(0);

		System.out.println(ch);
	}

	public static void math(int num) {
		double a = Math.sqrt(num);
		System.out.println(a);
	}
	
	public static void test1() {
		int number =2;
				int soFar=0;
		String[] onedigit = { "", " One", " Two", " Three", " Four", " Five", " Six", " Seven",
				" Eight", " Nine", " Ten", " Eleven", " Twelve", " Thirteen", " Fourteen", " Fifteen", " Sixteen",
				" Seventeen", " Eighteen", " Nineteen" };
		if (number % 100 < 20) {
			soFar = (number % 100);
			System.out.println("100"+soFar+"\n");
			number = number / 100;
		} else {
			soFar = (number % 10);
			//System.out.println("10"+soFar+"\n");
			number = number / 10;
			soFar = (number % 10) + soFar;
			//System.out.println("101"+soFar+"\n");
			number = number / 10;
		}
	//System.out.println(soFar);
	}

}

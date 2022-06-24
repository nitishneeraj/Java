class Test {
	public static void main(String args[]) {
		Test t1 = new Test();
		// t1.character();
		// t1.missNumber();
		//math(9);
		test4();
		//t1.divide();
	}
	
	
	void divide() {
		int a1=5,b1=5;
		int b=a1 % 5 ;// Remainder 
		int b2=b1 / 5 ; //Quotient 
		System.out.println(b);
		System.out.println(b2);
	}

	public static void missNumber() {
		//int arr[] = { 12, 13 };
		int a = 0, b = 0, sum;
//		for (int i : arr) {
//			arr[0] = a;
//			arr[1] = b;
//			System.out.println(a);
//		}
		sum = a + b;
		System.out.println(sum);
	}
	
	static void test4() {
		int num = 600;
		boolean[] bool = new boolean[num];
		for (int i = 0; i < bool.length; i++) {
			bool[i] = true;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			//System.out.println(i);
			if (bool[i] == true) {
				System.out.println("Value = "+i);
				for (int j = (i * i); j < num; j = j + i) {
					//System.out.print(j+" ");
					bool[j] = false;	// Because 4,6 already pehle hi false ho gya h
				}
				//System.out.println();
			} 
			//System.out.println(i);
		}
		System.out.println("\nList of prime numbers upto given number are : ");
		for (int i = 2; i < bool.length; i++) {
			if (bool[i] == true) {
				System.out.print(i+" ");
				}
		}
	}
	
	
	static void test3() {
			int i, flag = 0,num=11;
			// we have started i=2 because 2 is a known prime number
			for (i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = 1;
					System.out.println("================="+flag);
					break;
				}
			}
			if (flag == 0)
				System.out.println(1);
			else
				System.out.println(0);
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

	
	static void test2() {
		/*Bitwise XOR Operation of 5 and 7
		  0101
		^ 0111 
		 ________
  		  0010  = 2 (In decimal) */
		int a =5,b=3;
		a = a^b;
		b = a ^ b;  
		a = a ^ b;
		System.out.println(a);
		
	}
}

class Test {
	public static void main(String args[]) {
		Test t1 = new Test();
		// t1.character();
		// t1.missNumber();
		math(9);
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

}

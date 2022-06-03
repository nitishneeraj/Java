class Test {
	public static void main(String args[]) {
		Test t1 = new Test();
		// t1.test2();
		t1.character();
	}

	public static void test2() {
		String rev = "";
		for (int i = 0; i > 5; i--) {
			rev = rev + rev.charAt(i);
		}
		System.out.println(rev);
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
}

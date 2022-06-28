import java.util.Scanner;

public class Krishnamurthy_Number {

	void Krishnamurthy_No() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter any number : ");
		int n = 145;// sc.nextInt();
		if (checkNumber(n))
			System.out.println(n + " is a krishnamurthy number");
		else
			System.out.println(n + "is not a krishnamurthy number");
	}

	boolean checkNumber(int num) {
		int sum = 0;
		int tempNumber = num;
		while (tempNumber != 0) {
			sum = sum + fact(tempNumber % 10);
			tempNumber = tempNumber / 10;
		}
		if (sum == num)
			return true;
		else
			return false;
	}

	int fact(int number) {
		int f = 1;
		while (number != 0) {
			f = f * number;
			number--;
		}
		return f;
	}

}

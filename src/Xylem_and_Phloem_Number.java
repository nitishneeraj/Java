import java.util.Scanner;

public class Xylem_and_Phloem_Number {

	void XylemPhloem() {
		int num, extreme_sum = 0, mean_sum = 0, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		// finds the absolute value of the given number
		num = Math.abs(num);
		n = num;
		while (n != 0) {
			if (n == num || n < 10) {
				extreme_sum = extreme_sum + n % 10;
				//System.out.println("=="+n);
				//System.out.println("========="+extreme_sum);
			} else {
				mean_sum = mean_sum + n % 10;
			}
			// removes the last digit from the number
			n = n / 10;
			//System.out.println("***********"+n);
		}
		System.out.println("The sum of extreme digits: " + extreme_sum);
		System.out.println("The sum of mean digits: " + mean_sum);
		if (extreme_sum == mean_sum)
			// prints if sums are equal
			System.out.println(num + " is a xylem number.");
		else
			// prints if sums are not equal
			System.out.println(num + " is a phloem number.");
	}

}

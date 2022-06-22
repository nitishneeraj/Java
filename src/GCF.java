
public class GCF {

	void Greatest_Common_Factor() {
		int Num1 = 12, Num2 = 8, Temp, GCD = 0;
		while (Num2 != 0) {
			Temp = Num2;
			System.out.println(Temp);
			Num2 = Num1 % Num2;
			System.out.println(Num2);
			Num1 = Temp;
			System.out.println(Num1+"--------------------");
		}
		GCD = Num1;
		System.out.println("\n GCD =  " + GCD);
	}

}

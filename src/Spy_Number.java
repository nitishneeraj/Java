import java.util.Scanner;

public class Spy_Number {

	void Spy_No() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter any Number ");
		int num = 132,sum=0,multi=1,lastdigit;
				//sc.nextInt();
		
		while(num > 0) {
			lastdigit = (num%10);
			sum=sum+lastdigit; 
			//System.out.println("=============="+sum);
			multi = multi*lastdigit;
			//System.out.println("multi==========="+multi);
			num=num/10;  
		}
		//System.out.println("Sum=="+sum);
		//System.out.println("multi=="+multi);
		if(sum ==multi) {
			System.out.println("Spy Number");
		}else {
			System.out.println("Not Spy Number");
		}
		
	}
}

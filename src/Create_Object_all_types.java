import java.util.Scanner;

public class Create_Object_all_types {
	
	
	void show() {
		System.out.println("\nCreate object using new keyword");
	}
	
	
	void All_methods() {
	
		Scanner input = new Scanner(System.in); 
		int option1;
		//boolean loop_terminate = true;
		while (true) {
			System.out.println("\n1. Using new Keyword");
			System.out.println("2. Using clone() method");
			System.out.println("3. Using newInstance() method of the Class class");
			System.out.println("4. Using newInstance() method of the Constructor class");
			System.out.println("5. Using Deserialization");
			System.out.println("6.Exit main menu");
			System.out.print("Please enter your choice : ");
			option1 = input.nextInt();

			switch (option1) {

			case 1:
				show();
				break;
			case 2:
				System.out.println("Separately create class  ");
				System.out.println("Folllow this Class :->  Using_Clone_method");
				break;
			case 3:
				System.out.println("Folllow this Class :-> NewInstance_method");
				break; 
			case 4:
				System.out.println("Folllow this Class :->  NewInstance_method_of_Consructor");
				break;
			case 5:
				System.out.println("Folllow this Class :->  Employee/Using_SerializationExample/DeserializationExample");
				break;
			case 6:
				return; // terminate outer menu

			default:
				System.out.println("Invalid option");
			}
		}
	}
}

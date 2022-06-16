import java.util.Scanner;

public class Java_Basic_Programs2 extends Star_Pattern{
	static int n1 = 0, n2 = 1, n3, sum = 0, temp, store;
	static Scanner s1 = new Scanner(System.in);
	static void Fibonacci(int count) {
		// example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < count; i++) { // loop starts from 2 because 0 and 1 are already printed
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println("\n");
	}

	static void R_Fibonacci(int count) {
		// Fibonacci series program in java using recursion.
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			R_Fibonacci(count - 1);
		}
	}

	static int scanner() {
		
		int num = s1.nextInt();
		return num;
	}

	static void prime(int num) {
		// For example 2, 3, 5, 7, 11, 13, 17....
		int m, flag = 0;
		m = num / 2;
		if (num == 1 || num == 0) {
			System.out.println(num + " is not prime number");
		} else {
			for (int i = 0; i < num; i++) {
				if (num % 2 == 0) {
					System.out.println(num + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " is prime number");
			}
		}
		System.out.print("\n");
	}

	static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void fact(int num) {
		int fact = 1;
		for (int j = 1; j <= num; j++) {
			fact = fact * j;
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}

	static int fact_recursion(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * fact_recursion(n - 1));
		}
	}

	static int print() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("\n0. Exit");
		System.out.println("1. Fibonacci ");
		System.out.println("2. Prime Number ");
		System.out.println("3. Armstrong Number ");
		System.out.println("4. Generate Random Number");
		System.out.println("5. palindrome");
		System.out.println("6. Factorial ");
		System.out.println("7. Print Pattern ");
		System.out.println("8. Compare Two Objects ");
		System.out.println("9. Create Object in Java ");
		System.out.println("10. Print ASCII Value ");

		System.out.print("Please enter your choice : ");

		int value = s1.nextInt();
		return value;
	}

	static void Compare_obj() {
		// equals() Method
		
		Double x = new Double(123.45555);  
		//creating constructor of the Long class   
		Long y = new Long(9887544);  
		//invoking the equals() method   
		System.out.println("Objects are not equal, hence it returns " + x.equals(y));  
		System.out.println("Objects are equal, hence it returns " + x.equals(123.45555)); 
		
	}
	
	static void Armstrong(int num) {
		// 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
		System.out.println(num);
		temp = num;
		while (num > 0) {
			store = num % 10;
			sum = sum + (store * store * store);
			num = num / 10;
		}
		if (sum == temp) {
			System.out.print(temp + " number is a Armstrong.\n");
		} else {
			System.out.print(temp + " isn't a Armstrong\n");
		}
		System.out.println("");

	}

	static void Palindrome() {

		// example 545, 151, 34543, 343, 171, 48984
		// string like:- LOL, MADAM
		String original, reverse = ""; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");
		System.out.println("");
	}
	
	static int scan1() {
		Scanner s1 = new Scanner(System.in);
		int option2 = s1.nextInt();
		return option2;
	}

	static void ASCII() {
		 System.out.println("Enter a character: ");
		    char c = s1.next().charAt(0);
		    int asciivalue1 = c;
		    System.out.println("The ASCII value of " + c + " is: " + asciivalue1);  
	}
	public static void main(String[] args) {
		Star_Pattern st1 = new Star_Pattern();
		Number_Pattern n1 = new Number_Pattern();
		Character_Pattern ch1 = new Character_Pattern();
		boolean loop_terminate = true;

		while (true) {
			int a = print();
			switch (a) {
			case 1: {
				loop_terminate = true;
				while (loop_terminate) {
					System.out.println("\n1.Fibonacci Series using loop ");
					System.out.println("2.Fibonacci Series using recursion ");
					System.out.println("3.Return to Main Menu");
					System.out.print("Please enter your choice : ");
					int option2 =  scan1();
					switch (option2) {
					case 1: {
						System.out.print("\nEnter a number : ");
						int num = scanner();
						Fibonacci(num);
						break;
					}
					case 2: {
						System.out.print("\nEnter a number : ");
						int num = scanner();
						System.out.print(n1 + " " + n2);
						R_Fibonacci(num - 2);// n-2 because 2 numbers are already printed
						System.out.println("\n");
					}
					case 3: {
						loop_terminate = false;
						break;
					}
					default:
						System.out.println("Invalid option");
						break;
					}
				}
			}
				break;// never forget to add this break statement

				case 2: {
					loop_terminate = true;
				while (loop_terminate) {
					System.out.println("\n1.Prime Number  ");
					System.out.println("2.Prime Number Another way ");
					System.out.println("3.Return to Main Menu");
					System.out.print("Please enter your choice : ");
					int option2 =  scan1();
					switch (option2) {
					case 1: {
						System.out.println("");
						System.out.print("Enter a number : ");
						int num = scanner();
						prime(num);
						break;
					}
					case 2: {
						System.out.println("");
						System.out.print("Enter a number : ");
						int num = scanner();
						isPrime(num);
						if (isPrime(num)) {
							System.out.println(num + " is a prime number\n");
						} else {
							System.out.println(num + " is not a prime number\n");
						}
						break;
					}
					case 3: {
						loop_terminate = false;
						break;
					}
					default:
						System.out.println("Invalid option");
						break;
					}
				}
			}
				break;// never forget to add this break statement

			case 3: {
				System.out.print("\nEnter a number : ");
				int num = scanner();
				Armstrong(num);
				break;
			}
			case 4: {
				int min = 200;
				int max = 400;
				// Generate random int value from 200 to 400
				System.out.println("Random value of type int between " + min + " to " + max + ":");
				int b = (int) (Math.random() * (max - min + 1) + min);
				System.out.println(b);
				break;

			}
			case 5: {
				Palindrome();
				break;
			}
			case 6: {
				loop_terminate = true;
				while (loop_terminate) {
					System.out.println("\n1.Factorial Program using loop ");
					System.out.println("2.Factorial Program using recursion ");
					System.out.println("3.Return to Main Menu");
					System.out.print("Please enter your choice : ");
					int option2 =  scan1();
					switch (option2) {
					case 1: {
						System.out.print("\nEnter a number : ");
						int num = scanner();
						fact(num);
						break;
					}
					case 2: {
						int fact = 1;
						System.out.print("\nEnter a number : ");
						int num = scanner();
						fact = fact_recursion(num);
						System.out.println("Factorial of " + num + " is: " + fact);
						break;
					}
					case 3: {
						loop_terminate = false;
						break;
					}
					default:
						System.out.println("Invalid option");
						break;
					}
				}
			}
				break;// never forget to add this break statement
			case 7: {
				loop_terminate = true;
				while (loop_terminate) {
					System.out.println("\n1.Start Pattern ");
					System.out.println("2.Number Pattern ");
					System.out.println("3.Character Pattern ");
					System.out.println("4.Return to Main Menu");
					System.out.print("Please enter your choice : ");
					int option2 =  scan1();
					switch (option2) {
					case 1: {
						while (loop_terminate) {
							System.out.println("\n1.Right Triangle Star Pattern ");
							System.out.println("2.Left Triangle Star Pattern ");
							System.out.println("3.Pyramid Star Pattern ");
							System.out.println("4.Diamond Shape Pattern ");
							System.out.println("5.Downward Triangle Star Pattern ");
							System.out.println("6.Mirrored Right Triangle Star Pattern ");
							System.out.println("7.Reverse Pyramid Star Pattern ");
							System.out.println("8.Right Down Mirror Star Pattern ");
							System.out.println("9.Right Pascal's Triangle ");
							System.out.println("10.Left Pascal's Triangle ");
							System.out.println("11.Sandglass Star Pattern ");
							System.out.println("12.Alphabet Star Pattern ");
							System.out.println("13.Triangle Star Pattern ");
							System.out.println("14.Down Triangle Pattern ");
							System.out.println("15.Diamond Star Pattern ");
							System.out.println("16.Return to Main Menu");
							System.out.print("Please enter your choice : ");
							Scanner s11 = new Scanner(System	.in);
							int option3 = s11.nextInt();
							switch (option3) {
							case 1: {
								st1.Right_Triangle_Star_Pattern();
								break;
							}
							case 2: {
								st1.Left_Triangle_Star_Pattern();
								break;
							}
							case 3: {
								st1.Pyramid_Star_Pattern();
								break;
							}
							case 4: {
								st1.Diamond_Shape_Pattern();
								break;
							}
							case 5: {
								st1.Downward_Triangle_Star_Pattern();
								break;
							}
							case 6: {
								st1.Mirrored_Right_Triangle_Star_Pattern();
								break;
							}
							case 7: {
								st1.Reverse_Pyramid_Star_Pattern();
								break;
							}
							case 8: {
								st1.Right_Down_Mirror_Star_Pattern();
								break;
							}
							case 9: {
								st1.Right_Pascals_Triangle();
								break;
							}
							case 10: {
								st1.Left_Pascals_Triangle();
								break;
							}
							case 11: {
								st1.Sandglass_Star_Pattern();
								break;
							}
							case 12: {
								st1.Alphabet_Star_Pattern();
								break;
							}
							case 13: {
								st1.Triangle_Star_Pattern();
								break;
							}
							case 14: {
								st1.Down_Triangle_Pattern();
								break;
							}
							case 15: {
								st1.Diamond_Star_Pattern();
								break;
							}
							case 16: {
								loop_terminate = false;
								break;
							}
							default:
								System.out.println("Invalid option");
								break;
							}
						}

					}
						break;
					case 2: {
						loop_terminate = true;
						while (loop_terminate) {
							System.out.println("\n1.Pattern-1 ");
							System.out.println("2.Pattern-2 ");
							System.out.println("3.Pattern-3 ");
							System.out.println("4.Pattern-4 ");
							System.out.println("5.Pattern-5 ");
							System.out.println("6.Pattern-6 ");
							System.out.println("7.Pattern-7 ");
							System.out.println("8.Pattern-8 ");
							System.out.println("9.Pattern-9 ");
							System.out.println("10.Pattern-10 ");
							System.out.println("11.Pattern-11 ");
							System.out.println("12.Pattern-12 ");
							System.out.println("13.Pattern-13 ");
							System.out.println("14.Pattern-14 ");
							System.out.println("15.Pattern-15 ");
							System.out.println("16.Pattern-16 ");
							System.out.println("17.Pattern-17 ");
							System.out.println("18.Pattern-18 ");
							System.out.println("19.Pattern-19 ");
							System.out.println("20.Pattern-20 ");
							System.out.println("21.Pattern-21 ");
							System.out.println("22.Return to Main Menu");
							System.out.print("Please enter your choice : ");
							int option3 =  scan1();
							switch (option3) {
							case 1: {
								n1.Pattern_1();
								break;
							}
							case 2: {
								n1.Pattern_2();
								break;
							}
							case 3: {
								n1.Pattern_3();
								break;
							}
							case 5: {
								n1.Pattern_5();
								break;
							}
							case 6: {
								n1.Pattern_6();
								break;
							}
							case 7: {
								n1.Pattern_7();
								break;
							}
							case 9: {
								n1.Pattern_9();
								break;
							}
							case 11: {
								n1.Pattern_11();
								break;
							}
							case 12: {
								n1.Pattern_12();
								break;
							}
							case 13: {
								n1.Pattern_13();
								break;
							}
							case 14: {
								n1.Pattern_14();
								break;
							}
							case 15: {
								n1.Pattern_15();
								break;
							}
							case 16: {
								n1.Pattern_16();
								break;
							}
							case 17: {
								n1.Pattern_17();
								break;
							}
							case 18: {
								n1.Pattern_18();
								break;
							}
							case 19: {
								n1.Pattern_19();
								break;
							}
							case 20: {
								n1.Pattern_20();
								break;
							}
							case 22: {
								loop_terminate = false;
								break;
							}
							default:
								System.out.println("Invalid option");
								break;
							}
						}	
					}
					break;
					case 3: {
						loop_terminate = true;
						while (loop_terminate) {
							System.out.println("\n1.Right Triangle Alphabetic Pattern ");
							System.out.println("2.Repeating Alphabet Pattern ");
							System.out.println("3.K-shape Alphabet Pattern ");
							System.out.println("4.Triangle Character Pattern ");
							System.out.println("5.Diamond Character Pattern ");
							System.out.println("6.Return to Main Menu");
							System.out.print("Please enter your choice : ");
							int option3 =  scan1();
							switch (option3) {
							case 1: {
								ch1.Right_Triangle_Alphabetic_Pattern();
								break;
							}
							case 2: {
								ch1.Repeating_Alphabet_Pattern();
								break;
							}
							case 3: {
								ch1.K_shape_Alphabet_Pattern();
								break;
							}
							case 4: {
								ch1.Triangle_Character_Pattern();
								break;
							}
							case 5: {
								//ch1.Diamond_Character_Pattern();
								break;
							}
							case 6: {
								loop_terminate = false;
								break;
							}
							default:
								System.out.println("Invalid option");
								break;
							}
						}		
					}
					break;
					case 4: {
						loop_terminate = false;
						break;
					}
					default:
						System.out.println("Invalid option");
						break;
					}
				}
			}
				break;
			case 8: {
				Compare_obj();
				break;
			}
			case 9: {
				Create_Object_all_types theobj = new Create_Object_all_types();
				theobj.All_methods();
				break;
			}
			case 10: {
				ASCII();
				break;
			}

			case 0: {
				return;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + a);
			}
		}
	}
}

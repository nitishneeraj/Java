package String_Programs;

public class Reverse_string {
	
	void ReverseString() {
		String str = "Hello of the world";
		String rev ="";
		for (int i = str.length()-1; i >= 0; i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println();
		System.out.println("Original string:- " + str);    
        //Displays the reverse of given string    
        System.out.println("Reverse of given string:- " + rev);  
	}
	
	void ReverseString1() {
		String st = "Powerful man";
		String rev ="";
		char ch;
		for (int i = 0; i < st.length(); i++) {
			ch = st.charAt(i);
			rev = ch+rev;
		}
		System.out.println();
		System.out.println("Original string:- " + st);    
        //Displays the reverse of given string   
		System.out.println("Reverse of given string:- " + rev); 
	}

}

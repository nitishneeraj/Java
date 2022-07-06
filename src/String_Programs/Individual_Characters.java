package String_Programs;

public class Individual_Characters {
	
	void IndividualCharacters() {
		
		String string = "characters ";  
		  
        //Displays individual characters from given string  
        System.out.println("\nIndividual characters from given string: "); 
        
        for (int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i)+" ");
		}
        System.out.println();
		
	}

}
